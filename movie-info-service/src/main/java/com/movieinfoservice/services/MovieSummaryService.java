package com.movieinfoservice.services;

import com.movieinfoservice.models.MovieSummary;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieSummaryService {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackMovieSummaryInfo")
    public MovieSummary getMovieSummaryInfo(String movieId) {
        MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey, MovieSummary.class);
        return movieSummary;
    }

    public MovieSummary getFallbackMovieSummaryInfo(@PathVariable("movieId") String movieId) {
        return new MovieSummary(movieId, "", "Move info not available right now, try again after few seconds");
    }


}

package com.movieinfoservice.resources;

import com.movieinfoservice.models.Movie;
import com.movieinfoservice.models.MovieSummary;
import com.movieinfoservice.services.MovieService;
import com.movieinfoservice.services.MovieSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Autowired
    MovieService movieService;

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        return movieService.getMovieInfo(movieId);
    }
}

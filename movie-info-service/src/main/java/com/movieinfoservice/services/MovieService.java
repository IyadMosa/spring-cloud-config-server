package com.movieinfoservice.services;

import com.movieinfoservice.models.Movie;
import com.movieinfoservice.models.MovieSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieSummaryService movieSummaryService;

    public Movie getMovieInfo(String movieId) {
        MovieSummary movieSummary = movieSummaryService.getMovieSummaryInfo(movieId);
        return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
    }
}

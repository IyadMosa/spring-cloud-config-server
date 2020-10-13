package com.moviecatalogservice.models;

import lombok.Data;

import java.util.List;

@Data
public class UserRating {

    private String userId;
    private List<Rating> listOfMoviesRating;

    public UserRating() {
    }

    public UserRating(String userId, List<Rating> listOfMoviesRating) {
        this.userId = userId;
        this.listOfMoviesRating = listOfMoviesRating;
    }
}

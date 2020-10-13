package com.ratingsdataservice.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserRating {

    private String userId;
    private List<Rating> listOfMoviesRating = new ArrayList<>();

    public UserRating() {
    }

    public UserRating(String userId, List<Rating> listOfMoviesRating) {
        this.userId = userId;
        this.listOfMoviesRating = listOfMoviesRating;
    }
}

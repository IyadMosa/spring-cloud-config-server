package com.moviecatalogservice.models;

import lombok.Data;

import java.util.List;

@Data
public class UsersRatings {

    private List<UserRating> userRatingList;

    public UsersRatings() {
    }

    public UsersRatings(List<UserRating> userRatingList) {
        this.userRatingList = userRatingList;
    }
}

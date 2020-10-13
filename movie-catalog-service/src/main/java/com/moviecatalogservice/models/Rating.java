package com.moviecatalogservice.models;

import lombok.Data;

@Data
public class Rating {

    private String moveId;
    private int rating;

    public Rating(String moveId, int rating) {
        this.moveId = moveId;
        this.rating = rating;
    }

    public Rating() {
    }
}

package com.movieinfoservice.models;

import lombok.Data;

@Data
public class MovieSummary {

    private String id;
    private String title;
    private String overview;

    //Empty contracture for restTemplate call
    public MovieSummary() {
    }

    public MovieSummary(String id, String title, String overview) {
        this.id = id;
        this.title = title;
        this.overview = overview;
    }
}

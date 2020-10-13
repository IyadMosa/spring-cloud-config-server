package com.moviecatalogservice.models;

import lombok.Data;

@Data
public class Movie {

    private String movieId;
    private String name;
    private String desc;

    public Movie() {
    }

    public Movie(String movieId, String name, String desc) {
        this.movieId = movieId;
        this.name = name;
        this.desc = desc;
    }
}

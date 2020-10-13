package com.moviecatalogservice.models;

import lombok.Data;

@Data
public class CatalogItem {

    private String id;
    private String name;
    private String desc;
    private int rating;

    public CatalogItem(String id, String name, String desc, int rating) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }
}

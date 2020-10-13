package com.ratingsdataservice.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Rating {
    @Id
    @GeneratedValue
    private long id;

    private String moveId;

    private String userId;

    private int rating;

    public Rating() {
    }

    public Rating(long id, String moveId, String userId, int rating) {
        this.id = id;
        this.moveId = moveId;
        this.userId = userId;
        this.rating = rating;
    }
}

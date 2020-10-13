package com.usersinfoservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class UserInfo {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    public UserInfo() {
    }

    public UserInfo(long id, String name) {
        this.id = id;
        this.name = name;
    }
}

package com.moviecatalogservice.models;

import lombok.Data;

@Data
public class UserInfo {

    private String id;
    private String name;

    public UserInfo() {
    }

    public UserInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

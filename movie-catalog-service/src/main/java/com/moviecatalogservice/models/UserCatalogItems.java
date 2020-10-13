package com.moviecatalogservice.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserCatalogItems {

    private List<UserCatalogItem> list = new ArrayList<>();

    public UserCatalogItems() {
    }

    public UserCatalogItems(List<UserCatalogItem> list) {
        this.list = list;
    }
}

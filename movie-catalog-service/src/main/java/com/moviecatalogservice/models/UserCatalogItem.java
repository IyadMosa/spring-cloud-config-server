package com.moviecatalogservice.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserCatalogItem {

    private String userId;
    private String userName;
    private List<CatalogItem> userCatalogItems = new ArrayList<>();

    public UserCatalogItem(String userId, String userName, List<CatalogItem> userCatalogItems) {
        this.userId = userId;
        this.userName = userName;
        this.userCatalogItems = userCatalogItems;
    }
}

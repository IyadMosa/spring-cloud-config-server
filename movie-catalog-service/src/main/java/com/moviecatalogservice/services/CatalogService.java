package com.moviecatalogservice.services;

import com.moviecatalogservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CatalogService {

    @Autowired
    MovieInfo movieInfo;

    @Autowired
    UserRatingInfo userRatingInfo;

    @Autowired
    UserInfoService userInfoService;

    public UserCatalogItem getCatalogByUserId(String userId) {
        UserRating ratings = userRatingInfo.getUserRating(userId);
        UserInfo userInfo = userInfoService.getUserInfo(userId);
        List<CatalogItem> list = ratings.getListOfMoviesRating().stream().map(rating -> {
            Movie movie = movieInfo.getMovie(rating.getMoveId());
            return new CatalogItem(movie.getMovieId(), movie.getName(), movie.getDesc(), rating.getRating());
        }).collect(Collectors.toList());
        return new UserCatalogItem(userId, userInfo.getName(), list);
    }


    public List<UserCatalogItem> getAllCatalogs() {
        return userRatingInfo.getAllRatings().getUserRatingList().stream().map(userRating -> {
            UserInfo userInfo = userInfoService.getUserInfo(userRating.getUserId());
            List<CatalogItem> list = userRating.getListOfMoviesRating().stream().map(rating -> {
                Movie movie = movieInfo.getMovie(rating.getMoveId());
                return new CatalogItem(movie.getMovieId(), movie.getName(), movie.getDesc(), rating.getRating());
            }).collect(Collectors.toList());

            return new UserCatalogItem(userRating.getUserId(), userInfo.getName(), list);
        }).collect(Collectors.toList());
    }


}

package com.ratingsdataservice.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ratingsdataservice.models.Rating;
import com.ratingsdataservice.models.RatingRepository;
import com.ratingsdataservice.models.UserRating;
import com.ratingsdataservice.models.UsersRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingService {

    @Autowired
    RatingRepository repository;

    public Rating addNewRating(Rating rating) {
        return repository.save(rating);
    }

    @HystrixCommand(fallbackMethod = "getFallbackRatingByUserId")
    public UserRating getRatingByUserId(String userId) {
        List<Rating> list = repository.findByUserId(userId);
        return new UserRating(userId, list);

    }

    public UserRating getFallbackRatingByUserId(String userId) {
        return new UserRating("0", new ArrayList<>());
    }

    @HystrixCommand(fallbackMethod = "getFallbackAllUsersRatings")
    public UsersRatings getAllUsersRatings() {
        return new UsersRatings(repository.findAllUserId().stream().
                map(id -> getRatingByUserId(id)).
                collect(Collectors.toList()));

    }

    public UsersRatings getFallbackAllUsersRatings() {
        return new UsersRatings(new ArrayList<>());
    }
}

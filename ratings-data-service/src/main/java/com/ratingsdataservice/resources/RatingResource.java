package com.ratingsdataservice.resources;

import com.ratingsdataservice.models.Rating;
import com.ratingsdataservice.models.UserRating;
import com.ratingsdataservice.models.UsersRatings;
import com.ratingsdataservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @Autowired
    RatingService ratingService;

    @PostMapping("/add")
    public Rating addNewRating(@RequestBody Rating rating) {
        return ratingService.addNewRating(rating);
    }

    @GetMapping("users/{userId}")
    public UserRating getRatingByUser(@PathVariable("userId") String userId) {
        return ratingService.getRatingByUserId(userId);
    }


    @GetMapping("users/all")
    public UsersRatings getAllUsersRatings() {

        return ratingService.getAllUsersRatings();
    }
}

package com.ratingsdataservice.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    List<Rating> findByUserId(String userId);

    @Query("select userId from Rating")
    Set<String> findAllUserId();
}

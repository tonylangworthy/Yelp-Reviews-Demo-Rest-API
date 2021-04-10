package com.langworthy.yelpreviews.controllers;

import com.langworthy.yelpreviews.dto.ReviewResponse;
import com.langworthy.yelpreviews.providers.ReviewProvider;
import com.langworthy.yelpreviews.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("")
    public ResponseEntity<?> getReviews() {

        List<ReviewProvider> reviewProviderList = reviewService.fetchReviewList();
        List<ReviewResponse> reviewResponseList = new ArrayList<>();
        reviewProviderList.forEach(reviewProvider -> {

            reviewResponseList.add(new ReviewResponse(
                    reviewProvider.name(),
                    reviewProvider.avatarUrl(),
                    reviewProvider.location(),
                    reviewProvider.rating(),
                    reviewProvider.content()));
        });

        return ResponseEntity.ok(reviewResponseList);
    }
}

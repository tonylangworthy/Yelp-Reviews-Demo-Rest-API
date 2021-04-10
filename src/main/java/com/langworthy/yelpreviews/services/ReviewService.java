package com.langworthy.yelpreviews.services;

import com.langworthy.yelpreviews.providers.ReviewProvider;

import java.util.List;

public interface ReviewService {

    List<ReviewProvider> fetchReviewList();
}

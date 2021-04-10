package com.langworthy.yelpreviews.services;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ReviewerLocationServiceImpl implements ReviewerLocationService {

    private static final Logger logger = LoggerFactory.getLogger(ReviewerLocationServiceImpl.class);

    @Override
    public String fetchReviewerLocation(String profileUrl) {

        // Use web scraping to retrieve user location information from profile page
        return null;
    }
}

package com.langworthy.yelpreviews.adapters;

import com.langworthy.yelpreviews.models.YelpReview;
import com.langworthy.yelpreviews.providers.ReviewProvider;

import java.io.Serializable;

public class YelpReviewAdapter implements ReviewProvider, Serializable {

    private final String id;
    private final String name;
    private final String avatarUrl;
    private final String location;
    private final String rating;
    private final String content;

    public YelpReviewAdapter(String id, String name, String avatarUrl, String location, String rating, String content) {
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.location = location;
        this.rating = rating;
        this.content = content;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String avatarUrl() {
        return avatarUrl;
    }

    @Override
    public String location() {
        return location;
    }

    @Override
    public String rating() {
        return rating;
    }

    @Override
    public String content() {
        return content;
    }
}

package com.langworthy.yelpreviews.providers;

public interface ReviewProvider {

    String id();

    String name();

    String avatarUrl();

    String location();

    String rating();

    String content();
}

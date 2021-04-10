package com.langworthy.yelpreviews.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class YelpReviewList implements Serializable {

    private List<YelpReview> reviews;

    public List<YelpReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<YelpReview> reviews) {
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YelpReviewList that = (YelpReviewList) o;
        return Objects.equals(reviews, that.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviews);
    }

    @Override
    public String toString() {
        return "reviews{" +
                "reviews=" + reviews +
                '}';
    }
}

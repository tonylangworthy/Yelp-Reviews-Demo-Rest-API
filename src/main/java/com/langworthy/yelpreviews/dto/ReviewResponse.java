package com.langworthy.yelpreviews.dto;

import java.io.Serializable;
import java.util.Objects;

public class ReviewResponse implements Serializable {

    private String name;

    private String avatarImageUrl;

    private String location;

    private String rating;

    private String reviewContent;

    public ReviewResponse(String name, String avatarImageUrl, String location, String rating, String reviewContent) {
        this.name = name;
        this.avatarImageUrl = avatarImageUrl;
        this.location = location;
        this.rating = rating;
        this.reviewContent = reviewContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarImageUrl() {
        return avatarImageUrl;
    }

    public void setAvatarImageUrl(String avatarImageUrl) {
        this.avatarImageUrl = avatarImageUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewResponse that = (ReviewResponse) o;
        return Objects.equals(name, that.name) && Objects.equals(avatarImageUrl, that.avatarImageUrl) && Objects.equals(location, that.location) && Objects.equals(rating, that.rating) && Objects.equals(reviewContent, that.reviewContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avatarImageUrl, location, rating, reviewContent);
    }

    @Override
    public String toString() {
        return "ReviewResponse{" +
                "name='" + name + '\'' +
                ", avatarImageUrl='" + avatarImageUrl + '\'' +
                ", location='" + location + '\'' +
                ", rating='" + rating + '\'' +
                ", reviewContent='" + reviewContent + '\'' +
                '}';
    }
}

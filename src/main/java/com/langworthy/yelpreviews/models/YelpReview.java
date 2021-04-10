package com.langworthy.yelpreviews.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class YelpReview implements Serializable {

    private String id;

    private String rating;

    private String text;

    private YelpReviewUser user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public YelpReviewUser getUser() {
        return user;
    }

    public void setUser(YelpReviewUser user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YelpReview that = (YelpReview) o;
        return Objects.equals(id, that.id) && Objects.equals(rating, that.rating) && Objects.equals(text, that.text) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rating, text, user);
    }

    @Override
    public String toString() {
        return "YelpReview{" +
                "id='" + id + '\'' +
                ", rating='" + rating + '\'' +
                ", text='" + text + '\'' +
                ", user=" + user +
                '}';
    }
}

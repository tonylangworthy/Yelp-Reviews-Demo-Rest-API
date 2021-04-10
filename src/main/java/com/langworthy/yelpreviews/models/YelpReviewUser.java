package com.langworthy.yelpreviews.models;

import java.io.Serializable;
import java.util.Objects;

public class YelpReviewUser implements Serializable {

    private String id;

    private String profile_url;

    private String image_url;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YelpReviewUser that = (YelpReviewUser) o;
        return Objects.equals(id, that.id) && Objects.equals(profile_url, that.profile_url) && Objects.equals(image_url, that.image_url) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, profile_url, image_url, name);
    }

    @Override
    public String toString() {
        return "YelpReviewUserResponse{" +
                "id='" + id + '\'' +
                ", profileUrl='" + profile_url + '\'' +
                ", imageUrl='" + image_url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.vishal.retrofitsample.dao;

/**
 * Created by Vishal Aroor on 16-Aug-17.
 */

public class Flower {

    String name;
    String details;
    int rating;
    String url;
    String desc;

    public Flower() { }

    public Flower(String name, String details, int rating, String url, String desc) {
        this.name = name;
        this.details = details;
        this.rating = rating;
        this.url = url;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

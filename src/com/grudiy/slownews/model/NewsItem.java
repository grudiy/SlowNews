package com.grudiy.slownews.model;

import java.util.Date;

/**
 * Created by Owner on 02.09.2016.
 */
public class NewsItem {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String title;
    private String summary;
    private String date;
    private String imageURL;
    private String link;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public NewsItem(int id, String title, String summary, String date, String imageURL, String link) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.date = date;
        this.imageURL = imageURL;
        this.link = link;
    }

}

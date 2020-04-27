package com.example.edoofun.model;

public class EventModel {
    private int posterImageResId;
    private String title;
    private String description;
    private String date;
    private String fee;

    public EventModel(int posterImageResId, String title, String description, String date, String fee) {
        this.posterImageResId = posterImageResId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.fee = fee;
    }

    public int getPosterImageResId() {
        return posterImageResId;
    }

    public void setPosterImageResId(int posterImageResId) {
        this.posterImageResId = posterImageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
}

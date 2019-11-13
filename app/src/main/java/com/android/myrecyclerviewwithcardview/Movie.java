package com.android.myrecyclerviewwithcardview;

public class Movie {

    private int Image;
    private String title;
    private String description;

    public Movie() {
    }

    public Movie(int image, String title, String description) {
        Image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return Image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

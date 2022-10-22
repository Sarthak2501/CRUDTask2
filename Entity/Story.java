package com.example.demo.Entity;

import java.util.UUID;

public class Story {

    private UUID storyID;
    private UUID userID;

    private String imageContent;
    private String videoContent;

    private int views;

    public Story(UUID storyID, UUID userID, String imageContent, String videoContent, int views) {
        this.storyID = storyID;
        this.userID = userID;
        this.imageContent = imageContent;
        this.videoContent = videoContent;
        this.views = views;
    }

    public UUID getStoryID() {
        return storyID;
    }

    public void setStoryID(UUID storyID) {
        this.storyID = storyID;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getImageContent() {
        return imageContent;
    }

    public void setImageContent(String imageContent) {
        this.imageContent = imageContent;
    }

    public String getVideoContent() {
        return videoContent;
    }

    public void setVideoContent(String videoContent) {
        this.videoContent = videoContent;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }





}

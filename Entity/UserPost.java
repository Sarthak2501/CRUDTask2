package com.example.demo.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table
public class UserPost {

    @Id
    @SequenceGenerator(
            name = "userPost_sequence",
            sequenceName = "userPost_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "userPost_sequence"
    )
    private UUID postID;

    private UUID userID;

    private String ImageContent;

    private String VideoContent;

    private String TextContent;

    private LocalDateTime CreationTime;

    private String PostDescription;

    public UserPost(UUID postID, UUID userID, String imageContent,
                    String videoContent, String textContent,
                    LocalDateTime creationTime,
                    String postDescription) {
        this.postID = postID;
        this.userID = userID;
        ImageContent = imageContent;
        VideoContent = videoContent;
        TextContent = textContent;
        CreationTime = creationTime;
        PostDescription = postDescription;
    }

    public UserPost() {
        super();
    }

    public UUID getPostID() {
        return postID;
    }

    public void setPostID(UUID postID) {
        this.postID = postID;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getImageContent() {
        return ImageContent;
    }

    public void setImageContent(String imageContent) {
        ImageContent = imageContent;
    }

    public String getVideoContent() {
        return VideoContent;
    }

    public void setVideoContent(String videoContent) {
        VideoContent = videoContent;
    }

    public String getTextContent() {
        return TextContent;
    }

    public void setTextContent(String textContent) {
        TextContent = textContent;
    }

    public LocalDateTime getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        CreationTime = creationTime;
    }

    public String getPostDescription() {
        return PostDescription;
    }

    public void setPostDescription(String postDescription) {
        PostDescription = postDescription;
    }

    @Override
    public String toString() {
        return "UserPost{" +
                "postID=" + postID +
                ", userID=" + userID +
                ", ImageContent='" + ImageContent + '\'' +
                ", VideoContent='" + VideoContent + '\'' +
                ", TextContent='" + TextContent + '\'' +
                ", CreationTime=" + CreationTime +
                ", PostDescription='" + PostDescription + '\'' +
                '}';
    }
}

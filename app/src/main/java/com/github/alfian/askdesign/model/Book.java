package com.github.alfian.askdesign.model;

/**
 * Created by aufa18 on 27/12/17.
 */

public class Book {
    private Users user_id;
    private String title;
    private String description;
    private Integer color_count;
    private Integer responsive;
    private Integer duration;
    private String attachment;

    public Users getUser_id() {
        return user_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getColor_count() {
        return color_count;
    }

    public Integer getResponsive() {
        return responsive;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getAttachment() {
        return attachment;
    }
}

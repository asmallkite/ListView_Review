package com.example.a10648.recover;

/**
 * Created by 10648 on 2016/6/15 0015.
 */
public class Size {
    private int imageId;
    private String name;

    public Size(int imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

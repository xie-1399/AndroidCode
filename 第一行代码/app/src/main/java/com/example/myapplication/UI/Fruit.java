package com.example.myapplication.UI;

public class Fruit {
    private String name;    //对应水果的名字
    private int imageId;   //对应水果图片的id

    public String getName() {
        return name;
    }

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }
}

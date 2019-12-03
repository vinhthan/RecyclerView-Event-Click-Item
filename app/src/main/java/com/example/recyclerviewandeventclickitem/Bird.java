package com.example.recyclerviewandeventclickitem;

public class Bird {
    private int photo;
    private String name;
    private String description;

    public Bird(int photo, String name, String description) {
        this.photo = photo;
        this.name = name;
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

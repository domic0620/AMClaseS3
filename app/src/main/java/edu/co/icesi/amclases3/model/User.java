package edu.co.icesi.amclases3.model;

public class User {

    private int image;
    private String name;
    private String career;
    private String description;


    public User() {
    }

    public User(int image, String name, String career, String description) {
        this.image = image;
        this.name = name;
        this.career = career;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

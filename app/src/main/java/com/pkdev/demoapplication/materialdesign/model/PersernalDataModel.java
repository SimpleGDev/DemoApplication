package com.pkdev.demoapplication.materialdesign.model;

/**
 * Created by ultimate on 8/1/2015.
 */
public class PersernalDataModel {
    private String name;
    private String age;
    private String image;

    public PersernalDataModel(String name, String age, String image) {
        this.name = name;
        this.age = age;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getImage() {
        return image;
    }
}

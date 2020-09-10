package com.ecotourism.eco;

public class Contact {

    //private variables
    int id;
    String name;
    String about;

    // Empty constructor
    public Contact() {

    }

    // constructor
    public Contact(int id, String name, String about) {
        this.id = id;
        this.name = name;
        this.about = about;
    }

    // constructor
    public Contact(String name, String about) {
        this.name = name;
        this.about = about;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
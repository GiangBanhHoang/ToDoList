package com.example.todolist.mclass;

import java.util.Calendar;

public class Task {
    private   String ID;
    private   String name;
    private Calendar time;
    private int rating;
    private int icon;
    private String type;

    public Task(String ID, String name, Calendar time, int rating, int icon, String type) {
        this.ID = ID;
        this.name = name;
        this.time = time;
        this.rating = rating;
        this.icon = icon;
        this.type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

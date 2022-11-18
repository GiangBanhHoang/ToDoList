package com.example.todolist.mclass;

public class Category {
    private  String ID;
    private  String name;
    private  int icon;

    public Category(String ID, String name, int icon) {
        this.ID = ID;
        this.name = name;
        this.icon = icon;
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

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}

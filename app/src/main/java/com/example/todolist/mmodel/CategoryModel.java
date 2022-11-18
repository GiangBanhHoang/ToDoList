package com.example.todolist.mmodel;

import android.icu.text.Edits;

import com.example.todolist.mclass.Category;

import java.util.ArrayList;
import java.util.Iterator;

public class CategoryModel {
    private static ArrayList<Category> items;

    public static ArrayList<Category> getItems() {
        if (items == null) {
            items = new ArrayList<Category>();
            //Category category = new Category("Cat01","home",1);
            items.add(new Category("Cat01", "home", 1));
            items.add(new Category("Cat02", "company", 1));
            items.add(new Category("Cat03", "order", 1));
        }
        return items;
    }

    public static String getNameByID(String ID) {
        if(items==null){
            getItems();
        }
        Iterator<Category> itr = items.iterator();
        while (itr.hasNext()) {
            Category catCurent = itr.next();
            if (catCurent.getID().equalsIgnoreCase(ID))
                return catCurent.getName();
        }
        return null;
    }
}

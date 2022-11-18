package com.example.todolist.mmodel;

import com.example.todolist.R;
import com.example.todolist.mclass.Category;
import com.example.todolist.mclass.Task;

import java.util.ArrayList;
import java.util.Calendar;

public class    TaskModel {
    private static ArrayList<Task> items;
    public static ArrayList<Task> getItems(){
        if(items == null){
            items = new ArrayList<Task>();
            items.add(new Task("T01","Drink coffee", Calendar.getInstance(),1, R.drawable.washing_64,"Cat01"));
            items.add(new Task("T02","Coding", Calendar.getInstance(),2,R.drawable.watching_64,"Cat02"));
            items.add(new Task("T03","Game", Calendar.getInstance(),3,R.drawable.working_64,"Cat03"));
            items.add(new Task("T04","Love", Calendar.getInstance(),5,R.drawable.watching_64,"Cat01"));
            items.add(new Task("T05","Swing", Calendar.getInstance(),1,R.drawable.working_64,"Cat02"));
        }
        return items;
    }
}

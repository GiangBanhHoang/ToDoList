package com.example.todolist.mcomparate;

import com.example.todolist.mclass.Task;

import java.util.Comparator;

public class DESC implements Comparator<Task> {
    @Override
    public int compare(Task task, Task task1) {


        if (task.getRating() < (task1.getRating())) return 1;
        return -1;
    }
}




package com.example.todolist.mcomparate;

import com.example.todolist.mclass.Task;

import java.util.Comparator;

public class taskName_AZ implements Comparator<Task>{
    @Override
    public int compare(Task task, Task task1) {
        return task.getName().compareTo(task1.getName());
    }
}




package com.example.todolist.mcomparate;

import com.example.todolist.mclass.Task;

import java.util.Comparator;

public class taskName_ZA implements Comparator<Task> {
    @Override
    public int compare(Task task, Task task1) {

        return task1.getName().compareTo(task.getName());
    }
}




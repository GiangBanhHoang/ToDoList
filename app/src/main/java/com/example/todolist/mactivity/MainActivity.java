package com.example.todolist.mactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.todolist.R;
import com.example.todolist.madapter.LiskViewTaskAdapter;
import com.example.todolist.mclass.Helper;
import com.example.todolist.mclass.Task;
import com.example.todolist.mcomparate.ASC;
import com.example.todolist.mcomparate.DESC;
import com.example.todolist.mcomparate.taskName_AZ;
import com.example.todolist.mcomparate.taskName_ZA;
import com.example.todolist.mmodel.TaskModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private ListView listViewTask;
    private LiskViewTaskAdapter adaptertask;
    private Context context;
    private ArrayList<Task> itemstask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        itemstask = TaskModel.getItems();
        findViewByIDs();
        adaptertask = new LiskViewTaskAdapter(MainActivity.this, R.layout.cus_listview, TaskModel.getItems());
        listViewTask.setAdapter(adaptertask);
        listViewTask.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myintent = new Intent(MainActivity.this, InfoTaskActivity.class);
                startActivity(myintent);
            }
        });
    }

    private void findViewByIDs() {
        tvResult = (TextView) findViewById(R.id.tvResult);
        listViewTask = (ListView) findViewById(R.id.lvTask);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_sort_name_az:
                sortItemsTask(new taskName_AZ());
                break;
            case R.id.action_sort_name_za:
                sortItemsTask(new taskName_ZA());
                break;
            case R.id.action_sort_name_ASC:
                sortItemsTask(new ASC());
                break;
            case R.id.action_sort_name_DESC:
                sortItemsTask(new DESC());
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void sortItemsTask(Comparator<Task> comparator) {
        Collections.sort(itemstask, comparator);
        adaptertask.notifyDataSetChanged();
    }
}
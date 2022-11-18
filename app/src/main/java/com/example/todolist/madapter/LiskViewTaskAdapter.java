package com.example.todolist.madapter;


import android.content.Context;
import android.icu.util.Calendar;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import androidx.annotation.RequiresApi;

import com.example.todolist.R;
import com.example.todolist.mclass.Helper;
import com.example.todolist.mclass.Task;
import com.example.todolist.mmodel.CategoryModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class LiskViewTaskAdapter extends ArrayAdapter<Task> {
    private Context context;
    private int resource;
    private ArrayList<Task> items;

    class ViewHolder {
        ImageView taskIcon;
        RatingBar TaskRating;
        TextView TaskName, TaskCategory, TaskTime;

        public ViewHolder(View view) {
            this.taskIcon = (ImageView) view.findViewById(R.id.taskIcon);
            this.TaskRating = (RatingBar) view.findViewById(R.id.TaskRating);
            this.TaskName = (TextView) view.findViewById(R.id.TaskName);
            this.TaskCategory = (TextView) view.findViewById(R.id.TaskCategory);
            this.TaskTime = (TextView) view.findViewById(R.id.TaskTime);
        }
    }


    public LiskViewTaskAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.items = objects;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(resource, parent, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        viewHolder = (ViewHolder) view.getTag();
        Task itemsCur = items.get(position);
        if (itemsCur != null) {
            viewHolder.TaskName.setText(itemsCur.getName());
            viewHolder.TaskCategory.setText(CategoryModel.getNameByID(itemsCur.getType()));
            viewHolder.TaskRating.setRating(itemsCur.getRating());
            viewHolder.TaskTime.setText(Helper.showTimeday(itemsCur.getTime(),"HH:mm a"));
            viewHolder.taskIcon.setImageResource(itemsCur.getIcon());
        }
        return view;
    }
}

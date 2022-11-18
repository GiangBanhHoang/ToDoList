package com.example.todolist.mclass;

import android.content.Context;
import java.util.Calendar;
import android.os.Build;
import android.view.Gravity;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import java.text.SimpleDateFormat;

public class Helper {

    public static void showToast(Context context, String msg) {
        Toast myToast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 100);
        myToast.show();
    }

    public static int getResoureImage(Context context, String imageName) {
        int id = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
        return id;
    }



    public static String showTimeday(Calendar calendar, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(calendar.getTime());
    }
}

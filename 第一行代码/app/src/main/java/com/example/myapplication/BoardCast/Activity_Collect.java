package com.example.myapplication.BoardCast;

import android.app.Activity;

import com.example.myapplication.UI.Listview_Middle;

import java.util.ArrayList;
import java.util.List;

public class Activity_Collect {
    public static List<Activity> activities=new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}

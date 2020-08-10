package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.R;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        Log.d("SecondActivity",data);
    }
}

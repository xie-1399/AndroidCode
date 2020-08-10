package com.example.myapplication.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;

public class Framelayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
    }
}
}

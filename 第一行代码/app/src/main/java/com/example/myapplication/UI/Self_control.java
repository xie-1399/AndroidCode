package com.example.myapplication.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;

public class Self_control extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_control);
        //下面要把原来的标题栏进行隐藏
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
    }
}

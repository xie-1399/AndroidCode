package com.example.myapplication.Fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.UI.Compnent;
import com.example.myapplication.UI.Listview_Middle;

public class Fragment_Middle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment__middle);
        Button button1=(Button) findViewById(R.id.button_shiyong);
        Button button2=(Button) findViewById(R.id.button_news);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_shiyong:
                        Intent intent=new Intent(Fragment_Middle.this, TestFra.class);
                        startActivity(intent);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_news:
                        Intent intent=new Intent(Fragment_Middle.this, Practice.class);
                        startActivity(intent);
                }
            }
        });
    }
}

package com.example.myapplication.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class Listview_Middle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview__middle);
        Button button1=(Button) findViewById(R.id.button_fruit);
        Button button2=(Button) findViewById(R.id.button_Re);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_fruit:
                        Intent intent=new Intent(Listview_Middle.this, List_View.class);
                        startActivity(intent);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_Re:
                        Intent intent=new Intent(Listview_Middle.this, Recycler_View.class);
                        startActivity(intent);
                }
            }
        });
    }
}

package com.example.myapplication.UI;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.myapplication.R;

import java.text.AttributedCharacterIterator;

public class TitleLayout extends LinearLayout {  //继承自线性布局，相当于创建了一个自己的布局
    public TitleLayout(Context context, AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.activity_self_control,this);
        Button titleback=(Button)findViewById(R.id.titleBack);
        Button titleedit=(Button)findViewById(R.id.titleEdit);
        titleback.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        titleedit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Edit",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

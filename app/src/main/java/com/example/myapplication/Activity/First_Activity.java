package com.example.myapplication.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.R;

public class First_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data="Hello SecondActivity";
                Intent intent=new Intent(First_Activity.this,Second_Activity.class);
                startActivityForResult(intent,1);//1是唯一的请求码

                //                intent.putExtra("extra_data",data);//把想要传递的数据存在Intent中，等待第二个Activity取出
//                startActivity(intent);


//                Toast.makeText(First_Activity.this,"You Click Button",Toast.LENGTH_SHORT).show();
               // finish();//销毁一个活动
//                Intent intent=new Intent(First_Activity.this,Intent_learn.class);
//                startActivity(intent);
//                Intent intent=new Intent("com.example.activity.ACTION_START");
//                intent.addCategory("android.intent.category.add_one");
//                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.Add:
                Toast.makeText(this,"Add Menu",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Remove:
                Toast.makeText(this,"Remove Menu",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}

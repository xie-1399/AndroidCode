package com.example.myapplication.UI;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.myapplication.BoardCast.BaseActivity;
import com.example.myapplication.Fragment.Fragment_Middle;
import com.example.myapplication.Fragment.TestFra;
import com.example.myapplication.R;

public class Compnent extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compnent);
        Button button1=(Button) findViewById(R.id.button_UI);
        Button button2=(Button) findViewById(R.id.button_Alert);
        Button button3=(Button) findViewById(R.id.button_wait);
        Button button4=(Button) findViewById(R.id.button_buju);
        Button button5=(Button) findViewById(R.id.button_xiang);
        Button button6=(Button) findViewById(R.id.button_zhen);
        Button button7=(Button) findViewById(R.id.button_zi);
        Button button8=(Button) findViewById(R.id.button_F);
        Button button9=(Button) findViewById(R.id.button_L);

        final EditText editText = (EditText) findViewById(R.id.edit_text);
        final ImageView img1=(ImageView) findViewById(R.id.img1);//获取到图片对象
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_UI:
                        int progress=progressBar.getProgress();
                        progress=progress+10;//进度条每次加上10
                        progressBar.setProgress(progress);
//                        String input=editText.getText().toString();
//                        Toast.makeText(Compnent.this,input,Toast.LENGTH_SHORT).show();
                        //img1.setImageResource(R.drawable.img_2);  //点击按钮就能实现图片的一个切换
                        if(progress==100){//进度条到了100之后就不可见了
                            if(progressBar.getVisibility()==View.GONE){
                                progressBar.setVisibility(View.VISIBLE);//变为可见
                            }else {
                                progressBar.setVisibility(View.GONE);
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
        });
     button2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_Alert:
                        AlertDialog.Builder dialog=new AlertDialog.Builder(Compnent.this);
                        dialog.setTitle("This is Alert");
                        dialog.setMessage("Something is important");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        dialog .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        dialog.show();
                        break;
                default:
                    break;
            }
         }
     });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_wait:
                        ProgressDialog progressDialog=new ProgressDialog(Compnent.this);
                        progressDialog.setTitle("等待界面");
                        progressDialog.setMessage("Loading");
                        progressDialog.setCancelable(true);
                        progressDialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_buju:
                        Intent intent=new Intent(Compnent.this,Bu_Ju.class);
                        startActivity(intent);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_xiang:
                        Intent intent=new Intent(Compnent.this,Relativity.class);
                        startActivity(intent);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_zhen:
                        Intent intent=new Intent("com.example.test.FORCE_OFFLINE");//发送广播
                        sendBroadcast(intent);
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_zi:
                        Intent intent=new Intent(Compnent.this,Self_control.class);
                        startActivity(intent);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_F:
                        Intent intent=new Intent(Compnent.this, Fragment_Middle.class);
                        startActivity(intent);
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_L:
                        Intent intent=new Intent(Compnent.this, Listview_Middle.class);
                        startActivity(intent);
                }
            }
        });
    }
}

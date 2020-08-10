package com.example.myapplication.Fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class TestFra extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fra);
        Button button=(Button) findViewById(R.id.button_test);
        button.setOnClickListener(this);
        replaceFrag(new Right_Fragment());
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_test:
                replaceFrag(new Another_fragment());
                break;
            default:
                break;
        }
    }


    private void replaceFrag(Fragment fra){
        FragmentManager fram=getSupportFragmentManager();
        FragmentTransaction tran=fram.beginTransaction();
        tran.replace(R.id.right_layout,fra);
        tran.addToBackStack(null);  //添加一个返回栈
        tran.commit();
    }
}

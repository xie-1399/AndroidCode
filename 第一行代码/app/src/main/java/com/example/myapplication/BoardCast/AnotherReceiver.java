package com.example.myapplication.BoardCast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"receive in AnotherBroad",Toast.LENGTH_SHORT).show();
    }
}

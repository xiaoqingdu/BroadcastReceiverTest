package com.example.xiaoqingdu.broadcastreceivertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
       String strmsg=intent.getStringExtra("broadcastmsg");
        Toast.makeText(context,strmsg,Toast.LENGTH_LONG).show();
    }
}

package com.example.a013_broadcastreceiver_demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Application;

public class MyClass extends BroadcastReceiver {
    TextView tv1;

    public MyClass(TextView tv1) {
        this.tv1 = tv1;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //Toast.makeText(context, "Intent Detected", Toast.LENGTH_SHORT).show();
        tv1.setText("demo of broadcast reciver" + intent.getIntExtra("level", 0));

    }
}

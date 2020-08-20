package com.example.m3w;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    MyReceiver broad;
    IntentFilter filter;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        broad=new MyReceiver();
        filter=new IntentFilter();
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        filter.addAction("android.intent.action.AIRPLANE_MODE");
        filter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        filter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        filter.addAction("android.intent.action.BATTERY_LOW");
        filter.addAction("android.intent.action.BATTERY_OKAY");
        filter.addAction("com.example.m3w.My_Broadcast");

        registerReceiver(broad,filter);
    }
    public void BroadC(View view)
    {
        intent=new Intent();
        intent.setAction("com.example.m3w.My_Broadcast");
        sendBroadcast(intent);
    }
}

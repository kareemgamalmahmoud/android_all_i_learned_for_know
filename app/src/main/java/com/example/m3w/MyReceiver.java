package com.example.m3w;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent)
    {
        if(intent.getAction().equals("android.intent.action.BATTERY_OKAY"))
        {
            Toast.makeText(context,"Battery is Good",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals("android.intent.action.BATTERY_LOW"))
        {
            Toast.makeText(context,"Battery is LOW",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
        {
            Toast.makeText(context,"Power is Disconnected",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED"))
        {
            Toast.makeText(context,"Power is Connected",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals("android.intent.action.AIRPLANE_MODE"))
        {
            Toast.makeText(context,"Airplane Mood",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals("com.example.m3w.My_Broadcast"))
        {
            Toast.makeText(context,"My Broadcast",Toast.LENGTH_SHORT).show();
        }

    }
}

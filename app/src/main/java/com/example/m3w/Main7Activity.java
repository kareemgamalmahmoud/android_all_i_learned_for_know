package com.example.m3w;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity
{
    EditText e;
    TextView r;
    String msg="";
    String rs="";
    char[] a;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        e=findViewById(R.id.enc);
        r=findViewById(R.id.res);
    }

    public static char[] encrypt(char[] plain)
    {
        char[] temp=new char[plain.length];
        for(int i=0;i<plain.length;i++)
        {
            temp[i]=plain[i];
        }
        for (int j=0;j<plain.length;j++)
        {
            if(temp[j] =='a')
            {
                temp[j]='e';
            }
            if(temp[j] =='e')
            {
                temp[j]='o';
            }
            if(temp[j] =='i')
            {
                temp[j]='u';
            }
            if(temp[j] =='o')
            {
                temp[j]='i';
            }
            if(temp[j] =='u')
            {
                temp[j]='a';
            }
        }
        return temp;
    }

    public void ok(View view)
    {
        msg=e.getText().toString();
        a=new char[msg.length()];
        for(int i=0;i<msg.length();i++)
        {
            a[i]=msg.charAt(i);
        }
        rs=encrypt(a).toString();
        r.setText(rs);

    }
}

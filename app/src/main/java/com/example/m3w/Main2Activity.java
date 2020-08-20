package com.example.m3w;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity
{
    Intent come,scoreResult;
    RadioButton r1,r2,r3,r4,r5,r6;
    public static int count=0;
    public static String Rating="";
    public static final String Score="Score";
    public static final String rate="rate";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        r1=findViewById(R.id.ans1);
        r2=findViewById(R.id.ans2);
        r3=findViewById(R.id.ans3);
        r4=findViewById(R.id.ans4);
        r5=findViewById(R.id.ans5);
        r6=findViewById(R.id.ans6);
        come=getIntent();
    }

    public void score(View view)
    {
        if(r1.isChecked())
        {
            count++;
        }
        if (r2.isChecked())
        {
            count++;
        }
        if (r3.isChecked())
        {
            count++;
        }
        if (r4.isChecked())
        {
            count++;
        }
        if (r5.isChecked())
        {
            count++;
        }
        if (r6.isChecked())
        {
            count++;
        }
        if(count==3)
        {
            Rating="D";
        }
        if (count>3)
        {
            Rating="A";
        }
        if(count<3)
        {
            Rating="F";
        }
        Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show();
        scoreResult=new Intent(Main2Activity.this,Main3Activity.class);
        scoreResult.putExtra(Score,count);
        scoreResult.putExtra(rate,Rating);
        startActivity(scoreResult);
        count=0;
        Rating="";

    }
}

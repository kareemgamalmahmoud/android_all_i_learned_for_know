package com.example.m3w;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
    TextView N,ra;
    Intent came;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        N=findViewById(R.id.ScoreResultN);
        ra=findViewById(R.id.ScoreResult);
        came=getIntent();
        N.setText(""+came.getExtras().get(Main2Activity.Score));
        ra.setText(""+came.getExtras().get(Main2Activity.rate));
    }
}

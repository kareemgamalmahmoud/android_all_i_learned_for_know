package com.example.m3w;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Intent go;
    RadioButton Q,CI,CV,B,C;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Q=findViewById(R.id.quiz);
        CI=findViewById(R.id.img);
        CV=findViewById(R.id.vid);
        B=findViewById(R.id.broad);
        C=findViewById(R.id.cipher);
    }

    //==========================================================================


    public void Done(View view)
    {
        if(Q.isChecked())
        {
            Toast.makeText(this,"Go to IQ App",Toast.LENGTH_LONG).show();
            go=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(go);
        }
        if(CI.isChecked())
        {
            Toast.makeText(this,"Go to Cap.Img App",Toast.LENGTH_LONG).show();
            go=new Intent(MainActivity.this,Main4Activity.class);
            startActivity(go);
        }
        if(CV.isChecked())
        {
            Toast.makeText(this,"Go to Cap.Video App",Toast.LENGTH_LONG).show();
            go=new Intent(MainActivity.this,Main5Activity.class);
            startActivity(go);
        }
        if(B.isChecked())
        {
            Toast.makeText(this,"Go to Broadcast App",Toast.LENGTH_LONG).show();
            go=new Intent(MainActivity.this,Main6Activity.class);
            startActivity(go);
        }
        if(C.isChecked())
        {
            Toast.makeText(this,"Go to Cipher App",Toast.LENGTH_LONG).show();
            go=new Intent(MainActivity.this,Main7Activity.class);
            startActivity(go);
        }

    }
}

package com.example.m3w;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity
{
    final int REQUEST_IMAGE_CAPTURE=20;
    ImageView m;
    Bitmap ImageV;
    Intent cameraIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        m=findViewById(R.id.im);
    }

    public void OK(View view)
    {
        cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(cameraIntent.resolveActivity(getPackageManager())!=null)
        {
            startActivityForResult(cameraIntent,REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_IMAGE_CAPTURE && resultCode==RESULT_OK)
        {
            ImageV=(Bitmap)data.getExtras().get("data");
        }
    }

    public void View(View view)
    {
        if (ImageV!=null)
        {
            m.setImageBitmap(ImageV);
        }
    }

    public void Delete(View view)
    {
        m.setImageBitmap(null);
    }
}

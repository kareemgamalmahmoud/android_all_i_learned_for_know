package com.example.m3w;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.VideoView;

public class Main5Activity extends AppCompatActivity
{
    final int REQUEST_VIDEO_CAPTURE=10;
    VideoView v;
    Uri Video;
    Intent VideoInt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        v=findViewById(R.id.vi);
    }

    public void Cap(View view)
    {
        VideoInt=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if(VideoInt.resolveActivity(getPackageManager())!=null)
        {
            startActivityForResult(VideoInt,REQUEST_VIDEO_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_VIDEO_CAPTURE && resultCode==RESULT_OK)
        {
            Video=data.getData();
        }
    }

    public void display(View view)
    {
        if(Video!=null)
        {
            v.setVideoURI(Video);
            v.start();
        }
    }

    public void Delete(View view)
    {
        v.setVideoURI(null);
        v.start();
    }
}

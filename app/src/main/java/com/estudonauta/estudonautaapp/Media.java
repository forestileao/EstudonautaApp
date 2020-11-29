package com.estudonauta.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class Media extends AppCompatActivity {
    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        video = findViewById(R.id.video);
        String cam = "android.resource://com.estudonauta.estudonautaapp/" + R.raw.estudonauta;
        Uri arc = Uri.parse(cam);

        video.setVideoURI(arc);
        video.start();
    }

    public void clickBack(View view) {
        finish();
    }
}
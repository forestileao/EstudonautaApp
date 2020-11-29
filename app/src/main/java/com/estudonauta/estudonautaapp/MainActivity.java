package com.estudonauta.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    public void clickTeam(View view) {
        screen = new Intent(getApplicationContext(), Team.class);
        startActivity(screen);
    }

    public void clickCourses(View view) {
        screen = new Intent(getApplicationContext(), Courses.class);
        startActivity(screen);
    }

    public void clickMedia(View view) {
        screen = new Intent(getApplicationContext(), Media.class);
        startActivity(screen);
    }
}
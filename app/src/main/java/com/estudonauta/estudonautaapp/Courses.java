package com.estudonauta.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Courses extends AppCompatActivity {
    Intent nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
    }

    public void clickBack(View view) {
        finish();
    }

    public void clickCourseAndroid(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/android-studio/"));
        startActivity(nav);
    }

    public void clickCourseKotlin(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/kotlin/"));
        startActivity(nav);
    }

    public void clickCourseCs(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/c/"));
        startActivity(nav);
    }

    public void clickCourseC(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/linguagem-c/"));
        startActivity(nav);
    }

    public void clickCoursePhp(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/php-mysql/"));
        startActivity(nav);
    }

    public void clickCourseProd(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/producao-de-videos/"));
        startActivity(nav);
    }

    public void clickCoursePort(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/programacao-basica/"));
        startActivity(nav);
    }
}
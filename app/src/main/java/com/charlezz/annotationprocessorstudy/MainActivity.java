package com.charlezz.annotationprocessorstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.charlezz.annotation.CharlesIntent;

@CharlesIntent
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Charles.intentForSecondActivity(this);
    }
}

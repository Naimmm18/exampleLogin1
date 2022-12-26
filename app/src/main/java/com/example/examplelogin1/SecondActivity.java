package com.example.examplelogin1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public final static String USERNAME_KEY = "com.example.exampleLogin1.username_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String username = intent.getStringExtra(USERNAME_KEY);

        TextView textview = new TextView(this);
        textview.setTextSize(30);
        textview.setText("Welcome "+username+"!");
        setContentView(textview);}
    }

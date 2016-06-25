package com.devlovepreet.simpleui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public  final static  String MESSAGE_KEY = "com.devlovepreet.simpleui.message_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        TextView textView =  new TextView(this);
        textView.setTextSize(45);
        textView.setText(message);
        setContentView(textView);
    }
}

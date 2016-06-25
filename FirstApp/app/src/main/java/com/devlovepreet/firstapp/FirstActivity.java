package com.devlovepreet.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        textView = (TextView) findViewById(R.id.greetings_tv);
    }
    public  void showGreetings(View view)
    {
        String message = "Welocme to FirstApp";
        textView.setText(message);
    }
    public void showGreetingsNew(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Open Second Activity"))
        {
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("Open Third Activity"))
        {
            Intent intent = new Intent(this,ThirdActivity.class);
            startActivity(intent);
        }
    }
}

package com.devlovepreet.buttonclickevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn = (Button) findViewById(R.id.bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"You clicked on second button",Toast.LENGTH_LONG).show();
            }
        });
    }
    public  void getMe(View view){
        Toast.makeText(getBaseContext(),"You clicked on first button",Toast.LENGTH_LONG).show();

    }
}

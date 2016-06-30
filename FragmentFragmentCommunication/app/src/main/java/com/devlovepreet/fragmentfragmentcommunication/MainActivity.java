package com.devlovepreet.fragmentfragmentcommunication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnNameSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setName(String name) {
        FragmentTwo f2 = (FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.fragment_two);
        f2.updateInfo(name);
    }
}

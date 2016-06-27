package com.devlovepreet.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView final_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_result = (TextView) findViewById(R.id.result_text);
        final_result.setVisibility(View.INVISIBLE);
    }
    public void selectFruit(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.fruit_apple:
                if(checked) {
                    final_result.setText("You selected Apple");
                    final_result.setVisibility(View.VISIBLE);
                }
                else{
                    final_result.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.fruit_orange:
                if(checked) {
                    final_result.setText("You selected Orange");
                    final_result.setVisibility(View.VISIBLE);
                }
                else{
                    final_result.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.fruit_grapes:
                if(checked) {
                    final_result.setText("You selected Grapes");
                    final_result.setVisibility(View.VISIBLE);
                }
                else{
                    final_result.setVisibility(View.INVISIBLE);
                }
                break;
        }

    }
}

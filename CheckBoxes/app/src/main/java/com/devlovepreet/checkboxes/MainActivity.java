package com.devlovepreet.checkboxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();

    TextView finalText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finalText = (TextView)findViewById(R.id.final_result);
        //to hide textview at beginning
        finalText.setVisibility(View.INVISIBLE);
    }

    public void selectItem(View view)
    {
        boolean checked= ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.fruit_apple:
                if(checked)
                selection.add("Apple");
                else
                    selection.remove("Apple");
                break;
            case R.id.fruit_orange:
                if(checked)
                    selection.add("Orange");
                else
                    selection.remove("Orange");
                break;
            case R.id.fruit_grapes:
                if(checked)
                    selection.add("Grapes");
                else
                    selection.remove("Grapes");
                break;
        }

    }
    public void finalSelection(View view)
    {
        String final_fruit_selection = "";
        for(String Selections : selection)
        {
            final_fruit_selection = final_fruit_selection +Selections+"\n";
        }
        finalText.setText(final_fruit_selection);
        finalText.setVisibility(View.VISIBLE);
    }
}

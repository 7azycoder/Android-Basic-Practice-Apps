package com.devlovepreet.timepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by devlovepreet on 28/6/16.
 */
public class TimeSettings implements TimePickerDialog.OnTimeSetListener {

    Context context;
    public TimeSettings(Context context)
    {
        this.context =  context;
    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(context,"Selected time is hour :"+hourOfDay+" minute :"+minute,Toast.LENGTH_LONG).show();
    }
}

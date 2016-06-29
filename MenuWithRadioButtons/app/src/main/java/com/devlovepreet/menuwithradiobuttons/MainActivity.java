package com.devlovepreet.menuwithradiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int item_selection = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectNetwork(View view)
    {
        registerForContextMenu(view);
        openContextMenu(view);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.network_menu,menu);
        MenuItem item_wifi = menu.findItem(R.id.id_wifi);
        MenuItem item_bluetooth = menu.findItem(R.id.id_bluetooth);
        MenuItem item_mobile_data = menu.findItem(R.id.id_mobile_data);
        if(item_selection == 1)
        {
            item_wifi.setChecked(true);
        }
        else if(item_selection == 2)
        {
            item_bluetooth.setChecked(true);
        }
        else if(item_selection == 3)
        {
            item_mobile_data.setChecked(true);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.id_wifi:
                Toast.makeText(getApplicationContext(),"Wifi Selected",Toast.LENGTH_LONG).show();
                item.setChecked(true);
                item_selection = 1;
                return  true;
            case R.id.id_bluetooth:
                Toast.makeText(getApplicationContext(),"Bluetooth Selected",Toast.LENGTH_LONG).show();
                item.setChecked(true);
                item_selection = 2;
                return  true;
            case R.id.id_mobile_data:
                Toast.makeText(getApplicationContext(),"Mobile Data Selected",Toast.LENGTH_LONG).show();
                item.setChecked(true);
                item_selection = 3;
                return  true;
        }
        return super.onContextItemSelected(item);
    }
}

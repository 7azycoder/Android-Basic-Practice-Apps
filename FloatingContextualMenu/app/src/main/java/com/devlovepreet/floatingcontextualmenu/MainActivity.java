package com.devlovepreet.floatingcontextualmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] android_versions;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        //register listview for contextual mode
        registerForContextMenu(listView);
        android_versions = getResources().getStringArray(R.array.android_version);
        for(String item : android_versions)
        {
            arrayList.add(item);
        }
        //used when only things to be displayed
        //adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.row_layout,R.id.row_item,android_versions);
        //used when we want to add or remove items from menu
        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.row_layout,R.id.row_item,arrayList);
        listView.setAdapter(adapter);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_contextual_menu,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch(item.getItemId())
        {
            case R.id.id_delete:
                arrayList.remove(info.position);
                adapter.notifyDataSetChanged();
                return  true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}

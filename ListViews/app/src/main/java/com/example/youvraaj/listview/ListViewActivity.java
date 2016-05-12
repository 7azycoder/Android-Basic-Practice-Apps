package com.example.youvraaj.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends Activity {

    Place[] myPlacesArray = new Place[]{
            new Place("Art House", 78701 , "art" ,"This place is tasteful"),
            new Place("Bike Shop", 78702, "bike","Cool bikes"),
            new Place("Camera Fix", 78702, "polaroids","These guys always rip me off"),
            new Place("YETspace", 78702, "radio", "I LOVE this place"),
            new Place("Secret Space Pad", 94103, "rocket","Not very secret, are they?"),
            new Place("Taylor's Tailor", 60610, "scissors" , "Looking good.."),
            new Place("Boathouse", 78701, "shipwheel" ,"That place is full of pirates!"),
            new Place("Not Apple Store", 78702, "tablet", "Android rules!"),
            new Place("Tool Battleground", 78702, "tools", "That place is dangerous"),
            new Place("Travelpediocity", 78702, "travelerbag" ,"This is where i booked my summer trip"),
            new Place("UFO Pick-a-part", 90210, "ufo","Out of this world stuff here."),
            new Place("Spawrk's House", 99999, "volume", "The music is always so good"),

    };
    String[] myStringArray = new String[]{
            "Art house",
            "Bike Shop",
            "Camera Fix",
            "YETspace",
            "Secret Space Pad",
            "Taylor's Tailor",
            "Boathouse",
            "Not Apple Store",
            "Tool Background",
            "TravelPediocity",
            "UFO Pick-a-part",
            "Spawrl's House"
    };

    private ListView mListView;
    private PlaceAdapter mPlaceAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mListView= (ListView) findViewById(R.id.myListView);

        mPlaceAdapter =new PlaceAdapter(getApplicationContext(),R.layout.row , myPlacesArray);

        if(mListView!=null){
            mListView.setAdapter(mPlaceAdapter);
        }

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Log.v("PLACE",myStringArray[i]);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

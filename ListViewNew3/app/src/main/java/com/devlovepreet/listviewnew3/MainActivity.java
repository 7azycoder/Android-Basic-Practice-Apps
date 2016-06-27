package com.devlovepreet.listviewnew3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int[] movie_poster_resource = {R.drawable.avengers,R.drawable.bajrangi,R.drawable.blackhat,R.drawable.dragons,
            R.drawable.frankstein,R.drawable.ninja,R.drawable.oculus,R.drawable.water,R.drawable.ongbak};
    String[] movie_titles;
    String[] movie_ratings;
    MovieAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        movie_ratings = getResources().getStringArray(R.array.movie_ratings);
        movie_titles = getResources().getStringArray(R.array.movie_titles);
        int i=0;
        adapter = new MovieAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        for(String titles : movie_titles)
        {
            MovieDataProvider movieDataProvider = new MovieDataProvider(movie_poster_resource[i],titles,movie_ratings[i]);
            adapter.add(movieDataProvider);
            i++;
        }
    }
}

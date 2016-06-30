package com.devlovepreet.fragmentfragmentcommunication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by devlovepreet on 30/6/16.
 */
public class FragmentTwo extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view ;
        view = inflater.inflate(R.layout.fragment_two_layout,container,false);
        textView = (TextView) view.findViewById(R.id.display_name);
        textView.setVisibility(View.GONE);
        return  view;
    }

    public void updateInfo(String name)
    {
        textView.setText("Welcome "+name);
        textView.setVisibility(View.VISIBLE);
    }
}

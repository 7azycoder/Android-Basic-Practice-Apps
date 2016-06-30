package com.devlovepreet.fragmentcommunication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/**
 * Created by devlovepreet on 30/6/16.
 */
public class ColorFragment extends Fragment {
    RadioGroup Color_Group;
    OnColorChangeListener onColorChangeListener;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.color_fragment_layout,container,false);
        Color_Group = (RadioGroup) view.findViewById(R.id.color_group);
        Color_Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId)
                {
                    case R.id.red_id:
                        onColorChangeListener.colorChanged("RED");
                        break;
                    case R.id.green_id:
                        onColorChangeListener.colorChanged("GREEN");
                        break;
                    case R.id.blue_id:
                        onColorChangeListener.colorChanged("BLUE");
                        break;
                    case R.id.original_id:
                        onColorChangeListener.colorChanged("ORIGINAL");
                        break;

                }
            }
        });
        return  view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onColorChangeListener = (OnColorChangeListener) activity;
        }
        catch (Exception ex){

        }

    }

    //this is a interface defined by us
    public  interface OnColorChangeListener
    {
        public void colorChanged(String color_name);
    }
}

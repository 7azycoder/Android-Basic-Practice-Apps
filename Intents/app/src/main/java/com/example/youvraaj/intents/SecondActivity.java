package com.example.youvraaj.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Youvraaj on 12/12/2015.
 */
public class SecondActivity extends Activity {

    public static final int DETAIL_REQUEST = 1;
    private Button mButton= null;
    private Button mDetailButton = null;
    private TextView mSelectedView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mSelectedView = (TextView) findViewById(R.id.userSelection);

        mButton = (Button) findViewById(R.id.goFirstActivity);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), com.example.youvraaj.intents.FirstActivity.class);
                startActivity(i);
            }
        })
        ;

        mDetailButton = (Button) findViewById(R.id.goDetailActivity);
        mDetailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(v.getContext(), com.example.youvraaj.intents.DetailActivity.class);
                i.putExtra("KeyForSending","Some data from Second Activity");
                startActivityForResult(i,DETAIL_REQUEST);
            }
        });

        //Becoming an Implicit Intent receiver here
        Intent httpIntent = getIntent();
        String action = httpIntent.getAction();
        if(action!=null && action.equals(Intent.ACTION_VIEW)){
            Uri data = httpIntent.getData();
            if(data!=null){
                mSelectedView.setText(data.toString());
            }
        }

    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if(resultCode== RESULT_OK && requestCode == DETAIL_REQUEST)
        {
            if(data.hasExtra("KeyForReturning"))
            {
                String myValue = data.getExtras().getString("KeyForReturning");
                mSelectedView.setText(myValue);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
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

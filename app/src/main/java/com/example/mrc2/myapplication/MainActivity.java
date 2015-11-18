package com.example.mrc2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import org.lucasr.twowayview.TwoWayView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void requests(View v)
    {

        Intent i = new Intent(this,RequestsActivity.class);

        startActivity(i);

    }

    public void myrequests(View v)
    {

        Intent i = new Intent(this,MyRequestsActivitiy.class);

        startActivity(i);

    }

    public void addrequests(View v)
    {

        Intent i = new Intent(this,AddActivity.class);

        startActivity(i);

    }

}

package com.example.mrc2.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.lucasr.twowayview.TwoWayView;

public class AddActivity extends AppCompatActivity {

    EditText T1;
    EditText T2;
    EditText T3;
    EditText T4;
    TextView Tv;

    RadioButton R1;
    RadioButton R2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        setTitle("Add Requests");

        T1 = (EditText) findViewById(R.id.T1);
        T2 = (EditText) findViewById(R.id.T2);
        T3 = (EditText) findViewById(R.id.T3);
        T4 = (EditText) findViewById(R.id.T4);
        Tv = (TextView) findViewById(R.id.Tv);
        R1 = (RadioButton) findViewById(R.id.R1);
        R2 = (RadioButton) findViewById(R.id.R2);

        T1.setHintTextColor(Color.parseColor("#FFB0B0B0"));
        T2.setHintTextColor(Color.parseColor("#FFB0B0B0"));
        T3.setHintTextColor(Color.parseColor("#FFB0B0B0"));
        T4.setHintTextColor(Color.parseColor("#FFB0B0B0"));

        T1.setTypeface(Typeface.createFromAsset(getAssets(), "OpenSans-Regular.ttf"));
        T2.setTypeface(Typeface.createFromAsset(getAssets(), "OpenSans-Regular.ttf"));
        T3.setTypeface(Typeface.createFromAsset(getAssets(), "OpenSans-Regular.ttf"));
        T4.setTypeface(Typeface.createFromAsset(getAssets(), "OpenSans-Regular.ttf"));
        Tv.setTypeface(Typeface.createFromAsset(getAssets(), "OpenSans-Regular.ttf"));

        R1.setTypeface(Typeface.createFromAsset(getAssets(), "OpenSans-Regular.ttf"));
        R2.setTypeface(Typeface.createFromAsset(getAssets(), "OpenSans-Regular.ttf"));



        info obj[] = new info[7];

        obj[0]= new info();
        obj[0].Group = "O+";

        obj[1] = new info();
        obj[1].Group = "B+";

        obj[2] = new info();
        obj[2].Group = "A+";

        obj[3]= new info();
        obj[3].Group = "AB+";

        obj[4] = new info();
        obj[4].Group = "B-";

        obj[5] = new info();
        obj[5].Group = "A-";

        obj[6]= new info();
        obj[6].Group = "AB-";


        TwoWayView LV = (TwoWayView) findViewById(R.id.LV);

        RadioAdapter ra =new RadioAdapter(obj);

        LV.setAdapter(ra);

    }
}

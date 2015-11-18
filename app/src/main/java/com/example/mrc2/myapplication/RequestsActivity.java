package com.example.mrc2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RequestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);

        setTitle("Requests");

        info obj[] = new info[3];

        obj[0]= new info();
        obj[0].NAME = "Aneesh Jain";
        obj[0].ADDRESS = "Fortis Healthcare , Sector - 44 ,Opposite HUDA City Center, Gurgaon, Haryana.";
        obj[0].DATE = "Requested on : November 12,2015";
        obj[0].Group = "O+";

        obj[1] = new info();
        obj[1].NAME = "Akash Garg";
        obj[1].ADDRESS = "Saroj Super Speciality,Near Madhuban Chowk, Sector 14, Rohini, New Delhi.";
        obj[1].DATE = "Requested on : November 02,2015";
        obj[1].Group = "A-";

        obj[2] = new info();
        obj[2].NAME = "Swapnil Jindal";
        obj[2].ADDRESS = "MAX Hospital, Netaji Subash Complex, Pitampura, Delhi - 110034";
        obj[2].DATE = "Requested on : November 14,2015";
        obj[2].Group = "AB-";

        myAdapter adapter = new myAdapter(this,obj);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);

        RecyclerView RV = (RecyclerView) findViewById(R.id.LV);

        RV.setLayoutManager(lm);

        RV.setAdapter(adapter);

    }
}

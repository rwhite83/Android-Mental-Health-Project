package com.example.mentalhealthproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ServicesList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_list);


        String thePain = getIntent().getExtras().get("type").toString();

        TextView testView = findViewById(R.id.testView);
        testView.setText(thePain);
    }




}

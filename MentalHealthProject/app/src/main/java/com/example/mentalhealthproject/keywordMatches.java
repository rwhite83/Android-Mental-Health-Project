package com.example.mentalhealthproject;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.widget.ListView;

import java.util.ArrayList;


public class keywordMatches extends ListActivity {

    public static final String EXTRA_MESSAGE = "msg";

    ArrayList<String> keywordArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword_matches);

        Intent intent = getIntent();

        String[] keywordArray = intent.getStringArrayExtra(EXTRA_MESSAGE);

        keywordArrayList = new ArrayList<>();

        int arraySize = keywordArray.length;

        for (int i = 0; i < arraySize; i++) {
            keywordArrayList.add(keywordArray[i]);
        }

        ArrayAdapter<String> keywordAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, keywordArrayList);
        setListAdapter(keywordAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent i = new Intent(this, ServicesList.class);
        String thisString = keywordArrayList.get(position).toString();
        i.putExtra("type", thisString);
        startActivity(i);
    }


}

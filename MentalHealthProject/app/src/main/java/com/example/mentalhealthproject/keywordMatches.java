package com.example.mentalhealthproject;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.content.Intent;
import java.util.ArrayList;


public class keywordMatches extends ListActivity {

    public static final String EXTRA_MESSAGE = "msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword_matches);

        Intent intent = getIntent();

        String[] keywordArray = intent.getStringArrayExtra(EXTRA_MESSAGE);

        ArrayList<String> keywordArrayList = new ArrayList<>();

        int arraySize = keywordArray.length;

        for (int i = 0; i < arraySize; i++) {
            keywordArrayList.add(keywordArray[i]);
        }

        ArrayAdapter<String> keywordAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, keywordArrayList);
        setListAdapter(keywordAdapter);


        //String messageText = intent.getStringExtra(EXTRA_MESSAGE);

/*        StringTokenizer st = new StringTokenizer(messageText);
        String[] result = messageText.split("\\s");*/

/*        ArrayList<String> listItemsArrayList = new ArrayList<>();

        for(int i; result[i] != null; i++)
            listItemsArrayList.add(result[i]);
        }

        ListView thisList = findViewById(R.id.list);
        thisList.setAdapter(result);

        ArrayAdapter ad = new ArrayAdapter(ListActivity.this, android.R.)*/

/*        TextView messageView1 = findViewById(R.id.text1);
        messageView1.setText(result[0]);

        TextView messageView2 = findViewById(R.id.text2);
        messageView2.setText(result[1]);*/
    }


}

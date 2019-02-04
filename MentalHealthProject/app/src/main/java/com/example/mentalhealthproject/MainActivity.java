package com.example.mentalhealthproject;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;
import android.content.Context;
import android.widget.Toast;
import android.view.Gravity;
import android.provider.Settings;
import android.content.Intent;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText userInput;
    public TextToSpeech textSpeechField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = this.findViewById(R.id.inputText);
    }

    public void speakIn(View v) {
        Intent speechIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        speechIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        speechIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        startActivityForResult(speechIntent, 10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ArrayList<String> speech_result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
        userInput.setText(speech_result.get(0));
    }

    public void BtnSearch(View v) {
        // when button is clicked takes the user to the SearchResults activity
            EditText messageSent = findViewById(R.id.inputText);
            String messageText = messageSent.getText().toString();
            Intent intent = new Intent(this, keywordMatches.class);
            String[] messageArray = messageText.split("\\s");
            // string.split smf put tresulting thing into extra
            intent.putExtra("msg", messageArray);
            startActivity(intent);
    }

    public void BtnSuicideRisk(View v) {
        Intent switchIntent = new Intent(this, suicideCall.class);
        startActivity(switchIntent);
    }




}
package com.example.mentalhealthproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
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
import android.widget.Button;
import android.net.Uri;

public class suicideCall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suicide_call);
        findViewById(R.id.BtnSuicideCall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone("18334564566");
            }
        });
        findViewById(R.id.Btn911Call).setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                dialContactPhone("911");
            }
        });
    }

    public void BtnSuicideCall(View v) {
       dialContactPhone("18334564566");
    }

    public void Btn911Call(View v) {
        dialContactPhone("911");
    }

    public void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }


}

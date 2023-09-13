package com.example.calculatorappbarretto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent intent = getIntent();

        String received = intent.getStringExtra("historyText");

        Log.i("denna", "Received " + received);

        TextView infoTV = findViewById(R.id.textView7);
        infoTV.setText(received.substring(4));
    }

    public void switchToMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
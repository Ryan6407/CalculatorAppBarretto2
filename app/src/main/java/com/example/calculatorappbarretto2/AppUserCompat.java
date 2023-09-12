package com.example.calculatorappbarretto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppUserCompat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_user_compat);

        Intent intent = getIntent();
    }

    public void switchToMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
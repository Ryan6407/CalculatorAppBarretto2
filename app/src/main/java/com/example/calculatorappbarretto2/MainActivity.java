package com.example.calculatorappbarretto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){

        EditText number1 = (EditText) findViewById(R.id.inputNumber1);
        EditText number2 = (EditText) findViewById(R.id.inputNumber2);

        int buttonId = view.getId();

        if (buttonId == R.id.buttonAddition){
           //\ int result = number1 + number2;
            Log.i("ryan", "" + number1.getText() + number2.getText());
        }
    }
}
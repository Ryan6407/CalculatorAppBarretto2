package com.example.calculatorappbarretto2;

import static java.lang.Float.parseFloat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){

        EditText number1 = findViewById(R.id.inputNumber1);
        EditText number2 = (EditText) findViewById(R.id.inputNumber2);

        float number1_val = parseFloat(number1.getText().toString());
        float number2_val = parseFloat(number2.getText().toString());

        float result = 0;

        String output = "";

        int buttonId = view.getId();

        if (buttonId == R.id.buttonAddition){
            result = number1_val + number2_val;
            output = "" + number1_val + " + " + number2_val + " = " + result;
        }
        else if (buttonId == R.id.buttonSubstraction){
            result = number1_val - number2_val;
            output = "" + number1_val + " - " + number2_val + " = " + result;
        }
        else if (buttonId == R.id.buttonMultiplication){
            result = number1_val * number2_val;
            output = "" + number1_val + " x " + number2_val + " = " + result;
        }
        else if (buttonId == R.id.buttonDivision){
            result = number1_val / number2_val;
            output = "" + number1_val + " / " + number2_val + " = " + result;
        }

        Log.i("ryanbar", "" + result);

        Intent intent = new Intent(this, MainActivity.class);

        TextView outputTextView = findViewById(R.id.textView4);

        outputTextView.setText(output);
    }
}
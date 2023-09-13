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
    private String calculationHistory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){

        EditText number1 = findViewById(R.id.inputNumber1);
        EditText number2 = findViewById(R.id.inputNumber2);

        float number1_val = parseFloat(number1.getText().toString());
        float number2_val = parseFloat(number2.getText().toString());

        float result = 0;

        String output = "";

        String symbol = "";

        int buttonId = view.getId();

        if (buttonId == R.id.buttonAddition){
            result = number1_val + number2_val;
            output = "" + number1_val + " + " + number2_val + " = " + result;
            symbol = "  +";
        }
        else if (buttonId == R.id.buttonSubstraction){
            result = number1_val - number2_val;
            output = "" + number1_val + " - " + number2_val + " = " + result;
            symbol = "  -";
        }
        else if (buttonId == R.id.buttonMultiplication) {
            result = number1_val * number2_val;
            output = "" + number1_val + " x " + number2_val + " = " + result;
            symbol = "  x";
        }
        else if (buttonId == R.id.buttonDivision){
            result = number1_val / number2_val;
            output = "" + number1_val + " / " + number2_val + " = " + result;
            symbol = "  /";
        }
        else if (buttonId == R.id.buttonToPower){
            result = (float) Math.pow(number1_val, number2_val);
            output = "" + number1_val + " ^ " + number2_val + " = " + result;
            symbol = "  ^";
        }

        else if (buttonId == R.id.buttonModulus){
            result = number1_val % number2_val;
            output = "" + number1_val + " % " + number2_val + " = " + result;
            symbol = "  %";
        }

        else if (buttonId == R.id.buttonNotEqual){
            output = "False";
            if (number1_val != number2_val){
                output = "True";
            }
            symbol = "  ≠";
        }
        else if (buttonId == R.id.buttonGreaterThan){
            output = "False";
            if (number1_val > number2_val){
                output = "True";
            }
            symbol = "  >";
        }
        else if (buttonId == R.id.buttonLessThan){
            output = "False";
            if (number1_val < number2_val){
                output = "True";
            }
            symbol = "  <";
        }

        TextView outputTextView = findViewById(R.id.textView4);

        calculationHistory += output + "\n\n";

        Log.i("ryanbar", "" + calculationHistory);

        outputTextView.setText(output);

        TextView outputTextView2 = findViewById(R.id.textView3);

        outputTextView2.setText(symbol);
    }

    public void switchToAbout(View v){
        Intent intent = new Intent(this, AppUserCompat.class);
        startActivity(intent);
    }

    public void switchToHistory(View v){
        Intent intent = new Intent(this, HistoryActivity.class);
        intent.putExtra("historyText", calculationHistory);
        startActivity(intent);
    }
}
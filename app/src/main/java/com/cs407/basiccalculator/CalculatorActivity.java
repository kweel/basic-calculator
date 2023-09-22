package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatoractivity);
        TextView textViewResult = (TextView)findViewById(R.id.textViewResult);

        // Retrieve the result from the intent
        Intent intent = getIntent();
        if (intent != null) {
            double result = intent.getIntExtra("result", 0);
            textViewResult.setText("Result: " + result);
        }
    }
}
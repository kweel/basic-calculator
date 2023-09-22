package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;

    public void clickFunction (View view) {
        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());
        int result = 0;

        if (view.getId() == R.id.buttonAdd) {
            result = number1 + number2;
        } else if (view.getId() == R.id.buttonSubtract) {
            result = number1 - number2;
        } else if (view.getId() == R.id.buttonMult) {
            result = number1 * number2;
        } else if (view.getId() == R.id.buttonDiv) {
            result = number1 * number2;
        }

        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("result", result);

        startActivity(intent);
    }

//    public void goToActivity(String s) {
//        Intent intent = new Intent(this, CalculatorActivity.class);
//        intent.putExtra("message", s);
//        startActivity(intent);
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
    }
}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class BasicCalculator extends AppCompatActivity {
    private final String key = "NUM_PRO_MAIN";
    private String firstNumber;
    private String secondNumber;
    private Double firstNum;
    private Double secondNum;
    private String calculations;
    private Button buttonEquals;
    private Double resultNumber;
    private Button buttonNumberOne;
    private Button buttonNumberTwo;
    private Button buttonNumberThree;
    private Button buttonNumberFour;
    private Button buttonNumberFive;
    private Button buttonNumberSix;
    private Button buttonNumberSeven;
    private Button buttonNumberEight;
    private Button buttonNumberNine;
    private Button buttonNumberZero;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivide;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);
        buttonNumberOne = findViewById(R.id.buttonNumberOne);
        buttonNumberTwo = findViewById(R.id.buttonNumberTwo);
        buttonNumberThree = findViewById(R.id.buttonNumberThree);
        buttonNumberFour = findViewById(R.id.buttonNumberFour);
        buttonNumberFive = findViewById(R.id.buttonNumberFive);
        buttonNumberSix = findViewById(R.id.buttonNumberSix);
        buttonNumberSeven = findViewById(R.id.buttonNumberSeven);
        buttonNumberEight = findViewById(R.id.buttonNumberEight);
        buttonNumberNine = findViewById(R.id.buttonNumberNine);
        buttonNumberZero = findViewById(R.id.buttonNumberZero);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonEquals = findViewById(R.id.buttonEquals);
        tvResult = findViewById(R.id.tvResult);
        tvResult.setText("");
        calculations = "";
        firstNumber = "";
        secondNumber = "";

        buttonNumberOne.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "1";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberTwo.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "2";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberThree.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "3";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberFour.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "4";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberFive.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "5";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberSix.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "6";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberSeven.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "7";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberEight.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "8";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberNine.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "9";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberZero.setOnClickListener(view -> {
                    calculations = "";
                    firstNumber += "0";
                    calculations += firstNumber;
                    tvResult.setText(calculations);
                }
        );




        buttonPlus.setOnClickListener(view -> {
                    firstNum = Double.valueOf(firstNumber);
                    calculations += " + ";
                    tvResult.setText(calculations);
                    Intent intent = new Intent(this, PlusActivity.class);
                    String value = firstNumber;
                    intent.putExtra(key, value);
                    startActivity(intent);
                }
        );







//        buttonMinus.setOnClickListener(view ->{
//                    firstNumber = 1;
//                }
//        );
//
//        buttonMultiply.setOnClickListener(view ->{
//                    firstNumber = 1;
//                }
//        );
//
//        buttonDivide.setOnClickListener(view ->{
//                    firstNumber = 1;
//                }
//        );

    }
}

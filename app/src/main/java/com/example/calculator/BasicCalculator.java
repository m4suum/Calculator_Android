package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class BasicCalculator extends AppCompatActivity {
    private String calculations;
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
    private Button buttonEquals;
    private Button buttonPoint;
    private Button buttonOpenCalculatorPro;
    private Button buttonPercent;
    private Button buttonClear;
    private Button buttonClearAll;
    private TextView tvResult;
    private Calculator calculator;
    private LineHandler lineHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);
        lineHandler = new LineHandler(null, 0);
        calculator = new Calculator(lineHandler);
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
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonOpenCalculatorPro = findViewById(R.id.buttonOpenCalculatorPro);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonClear = findViewById(R.id.buttonClear);
        buttonClearAll = findViewById(R.id.buttonClearAll);
        tvResult = findViewById(R.id.tvResult);
        tvResult.setText("");
        calculations = "";

        buttonNumberOne.setOnClickListener(view -> {
                    calculations += "1";
                    tvResult.setText(calculations);
                }
        );

        buttonNumberTwo.setOnClickListener(view -> {
                    calculations += "2";
                    tvResult.setText(calculations);
                }
        );

        buttonNumberThree.setOnClickListener(view -> {
                    calculations += "3";
                    tvResult.setText(calculations);
                }
        );

        buttonNumberFour.setOnClickListener(view -> {
                    calculations += "4";
                    tvResult.setText(calculations);
                }
        );

        buttonNumberFive.setOnClickListener(view -> {
                    calculations += "5";
                    tvResult.setText(calculations);
                }
        );

        buttonNumberSix.setOnClickListener(view -> {
                    calculations += "6";
                    tvResult.setText(calculations);
                }
        );

        buttonNumberSeven.setOnClickListener(view -> {
                    calculations += "7";
                    tvResult.setText(calculations);
                }
        );

        buttonNumberEight.setOnClickListener(view -> {
                    calculations += "8";
                    tvResult.setText(calculations);
                }
        );

        buttonNumberNine.setOnClickListener(view -> {
                    calculations += "9";
                    tvResult.setText(calculations);
                }
        );

        buttonNumberZero.setOnClickListener(view -> {
                    calculations += "0";
                    tvResult.setText(calculations);
                }
        );


        buttonPlus.setOnClickListener(view -> {
                    calculations += " + ";
                    tvResult.setText(calculations);
                }
        );

        buttonMinus.setOnClickListener(view -> {
                    calculations += " - ";
                    tvResult.setText(calculations);
                }
        );

        buttonMultiply.setOnClickListener(view -> {
                    calculations += " * ";
                    tvResult.setText(calculations);
                }
        );

        buttonDivide.setOnClickListener(view -> {
                    calculations += " / ";
                    tvResult.setText(calculations);
                }
        );

        buttonPoint.setOnClickListener(view -> {
                    calculations += ".";
                    tvResult.setText(calculations);
                }
        );

        buttonPercent.setOnClickListener(view -> {
                    calculations += " % ";
                    tvResult.setText(calculations);
                }
        );

        buttonClear.setOnClickListener(view -> {
                    calculations = calculations.substring(0, calculations.length() - 1);
                    tvResult.setText(calculations);
                }
        );

        buttonClearAll.setOnClickListener(view -> {
                    calculations = "";
                    tvResult.setText(calculations);
                }
        );

        buttonEquals.setOnClickListener(view -> {
                    calculations = String.valueOf(calculator.calculatorHandleLine(calculations));
                    tvResult.setText(calculations);
                }
        );
    }
}

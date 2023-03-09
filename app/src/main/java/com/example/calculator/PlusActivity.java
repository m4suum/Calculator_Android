package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PlusActivity extends AppCompatActivity {
    private final String key = "NUM_PRO_MAIN";
    private Calculator calculator;
    private PlusOperation plusOperation;
    private MinusOperation minusOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;
    private String secondNumber;
    private String firstNumber;
    private Double firstNum;
    private Double secondNum;

    private Double resultNumber;
    private String calculations;
    private TextView tvResult;
    private Button buttonEquals;
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

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);
        buttonNumberOne = findViewById(R.id.buttonNumberOnePlus);
        buttonNumberTwo = findViewById(R.id.buttonNumberTwoPlus);
        buttonNumberThree = findViewById(R.id.buttonNumberThreePlus);
        buttonNumberFour = findViewById(R.id.buttonNumberFourPlus);
        buttonNumberFive = findViewById(R.id.buttonNumberFivePlus);
        buttonNumberSix = findViewById(R.id.buttonNumberSixPlus);
        buttonNumberSeven = findViewById(R.id.buttonNumberSevenPlus);
        buttonNumberEight = findViewById(R.id.buttonNumberEightPlus);
        buttonNumberNine = findViewById(R.id.buttonNumberNinePlus);
        buttonNumberZero = findViewById(R.id.buttonNumberZeroPlus);
        buttonEquals = findViewById(R.id.buttonEqualsPlus);
        tvResult = findViewById(R.id.tvResultPlus);
        tvResult.setText("");
        secondNumber = "";
        firstNumber = getIntent().getStringExtra(key);
        firstNum = Double.parseDouble(firstNumber);
        calculations = firstNumber + " + ";
        buttonNumberOne.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "1";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberTwo.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "2";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberThree.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "3";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberFour.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "4";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberFive.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "5";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberSix.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "6";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberSeven.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "7";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberEight.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "8";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberNine.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "9";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonNumberZero.setOnClickListener(view -> {
                    calculations = firstNumber + " + ";
            secondNumber += "0";
                    calculations += secondNumber;
                    tvResult.setText(calculations);
                }
        );

        buttonEquals.setOnClickListener(view -> {
            secondNum = Double.valueOf(secondNumber);
            plusOperation = new PlusOperation((double) 0, (double) 0, (double) 0);
            minusOperation = new MinusOperation((double) 0, (double) 0, (double) 0);
            multiplyOperation = new MultiplyOperation((double) 0, (double) 0, (double) 0);
            divideOperation = new DivideOperation((double) 0, (double) 0, (double) 0);

            calculator = new Calculator(plusOperation,minusOperation, multiplyOperation, divideOperation);
            resultNumber = Double.valueOf(calculator.calculatorPlus(firstNum, secondNum));
            calculations += " = ";
            calculations += String.valueOf(resultNumber);
            tvResult.setText(calculations);
        });

    }
}
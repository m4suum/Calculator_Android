package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.calculatorlogic.Calculator;

public class BasicCalculator extends AppCompatActivity {
    private String calculations;
    private final String key = "KEFTEME_CALCULATOR";
    private TextView tvResult;
    private Calculator calculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calculator = Calculator.getCalculator();
        setContentView(R.layout.activity_basic_calculator);
        Button buttonNumberOne = findViewById(R.id.buttonNumberOne);
        Button buttonNumberTwo = findViewById(R.id.buttonNumberTwo);
        Button buttonNumberThree = findViewById(R.id.buttonNumberThree);
        Button buttonNumberFour = findViewById(R.id.buttonNumberFour);
        Button buttonNumberFive = findViewById(R.id.buttonNumberFive);
        Button buttonNumberSix = findViewById(R.id.buttonNumberSix);
        Button buttonNumberSeven = findViewById(R.id.buttonNumberSeven);
        Button buttonNumberEight = findViewById(R.id.buttonNumberEight);
        Button buttonNumberNine = findViewById(R.id.buttonNumberNine);
        Button buttonNumberZero = findViewById(R.id.buttonNumberZero);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonEquals = findViewById(R.id.buttonEquals);
        Button buttonPoint = findViewById(R.id.buttonPoint);
        Button buttonOpenCalculatorPro = findViewById(R.id.buttonOpenCalculatorPro);
        Button buttonPercent = findViewById(R.id.buttonPercent);
        Button buttonClear = findViewById(R.id.buttonClear);
        Button buttonClearAll = findViewById(R.id.buttonClearAll);
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
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".") && !calculations.substring(calculations.length() - 1).equals("+") && !calculations.substring(calculations.length() - 1).equals("-") && !calculations.substring(calculations.length() - 1).equals("*") && !calculations.substring(calculations.length() - 1).equals("/") && !calculations.substring(calculations.length() - 1).equals("^") && !calculations.substring(calculations.length() - 1).equals("√") && !calculations.substring(calculations.length() - 1).equals("n") && !calculations.substring(calculations.length() - 1).equals("s")) {
                            calculations += " + ";
                            tvResult.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonMinus.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".") && !calculations.substring(calculations.length() - 1).equals("+") && !calculations.substring(calculations.length() - 1).equals("-") && !calculations.substring(calculations.length() - 1).equals("*") && !calculations.substring(calculations.length() - 1).equals("/") && !calculations.substring(calculations.length() - 1).equals("^") && !calculations.substring(calculations.length() - 1).equals("√") && !calculations.substring(calculations.length() - 1).equals("n") && !calculations.substring(calculations.length() - 1).equals("s")) {
                            calculations += " - ";
                            tvResult.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonMultiply.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".") && !calculations.substring(calculations.length() - 1).equals("+") && !calculations.substring(calculations.length() - 1).equals("-") && !calculations.substring(calculations.length() - 1).equals("*") && !calculations.substring(calculations.length() - 1).equals("/") && !calculations.substring(calculations.length() - 1).equals("^") && !calculations.substring(calculations.length() - 1).equals("√") && !calculations.substring(calculations.length() - 1).equals("n") && !calculations.substring(calculations.length() - 1).equals("s")) {
                            calculations += " * ";
                            tvResult.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonDivide.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".") && !calculations.substring(calculations.length() - 1).equals("+") && !calculations.substring(calculations.length() - 1).equals("-") && !calculations.substring(calculations.length() - 1).equals("*") && !calculations.substring(calculations.length() - 1).equals("/") && !calculations.substring(calculations.length() - 1).equals("^") && !calculations.substring(calculations.length() - 1).equals("√") && !calculations.substring(calculations.length() - 1).equals("n") && !calculations.substring(calculations.length() - 1).equals("s")) {
                            calculations += " / ";
                            tvResult.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonPoint.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".") && !calculations.substring(calculations.length() - 1).equals("+") && !calculations.substring(calculations.length() - 1).equals("-") && !calculations.substring(calculations.length() - 1).equals("*") && !calculations.substring(calculations.length() - 1).equals("/") && !calculations.substring(calculations.length() - 1).equals("^") && !calculations.substring(calculations.length() - 1).equals("√") && !calculations.substring(calculations.length() - 1).equals("!") && !calculations.substring(calculations.length() - 1).equals("n") && !calculations.substring(calculations.length() - 1).equals("s")) {
                            boolean havePoint = false;
                            for (int i = calculations.length() - 1; i >= 0; i--) {
                                if (calculations.charAt(i) == '.') {
                                    havePoint = true;
                                    break;
                                } else if (calculations.charAt(i) == ' ') {
                                    break;
                                }
                            }
                            if (!havePoint) {
                                calculations += ".";
                                tvResult.setText(calculations);
                            }
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonPercent.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".") && !calculations.substring(calculations.length() - 1).equals("+") && !calculations.substring(calculations.length() - 1).equals("-") && !calculations.substring(calculations.length() - 1).equals("*") && !calculations.substring(calculations.length() - 1).equals("/") && !calculations.substring(calculations.length() - 1).equals("^") && !calculations.substring(calculations.length() - 1).equals("√") && !calculations.substring(calculations.length() - 1).equals("!") && !calculations.substring(calculations.length() - 1).equals("n") && !calculations.substring(calculations.length() - 1).equals("s")) {
                            calculations += " %";
                            tvResult.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonClear.setOnClickListener(view -> {
                    try {
                        calculations = calculations.substring(0, calculations.length() - 1);
                        tvResult.setText(calculations);
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonClearAll.setOnClickListener(view -> {
                    calculations = "";
                    tvResult.setText(calculations);
                }
        );

        buttonEquals.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".")) {
                            calculations = calculator.calculatorHandleLine(calculations).replaceAll("\\.?0*$", "");
                            tvResult.setText(calculations);
                        }
                    } catch (IndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonOpenCalculatorPro.setOnClickListener(view -> {
            Intent intent = new Intent(this, EngineeringCalculator.class);
            intent.putExtra(key, calculations);
            startActivity(intent);
            finish();

        });
        String ecCalculations = getIntent().getStringExtra(key);
        if (ecCalculations != null) calculations = ecCalculations;
        tvResult.setText(calculations);
    }
}
package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.calculatorlogic.Calculator;

public class EngineeringCalculator extends AppCompatActivity {
    private String calculations;
    private final String key = "KEFTEME_CALCULATOR";
    private TextView tvResultEngineer;
    private Calculator calculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calculator = Calculator.getCalculator();
        setContentView(R.layout.activity_engineering_calculator);
        Button buttonNumberOneEngineer = findViewById(R.id.buttonNumberOneEngineer);
        Button buttonNumberTwoEngineer = findViewById(R.id.buttonNumberTwoEngineer);
        Button buttonNumberThreeEngineer = findViewById(R.id.buttonNumberThreeEngineer);
        Button buttonNumberFourEngineer = findViewById(R.id.buttonNumberFourEngineer);
        Button buttonNumberFiveEngineer = findViewById(R.id.buttonNumberFiveEngineer);
        Button buttonNumberSixEngineer = findViewById(R.id.buttonNumberSixEngineer);
        Button buttonNumberSevenEngineer = findViewById(R.id.buttonNumberSevenEngineer);
        Button buttonNumberEightEngineer = findViewById(R.id.buttonNumberEightEngineer);
        Button buttonNumberNineEngineer = findViewById(R.id.buttonNumberNineEngineer);
        Button buttonNumberZeroEngineer = findViewById(R.id.buttonNumberZeroEngineer);
        Button buttonPlusEngineer = findViewById(R.id.buttonPlusEngineer);
        Button buttonMinusEngineer = findViewById(R.id.buttonMinusEngineer);
        Button buttonMultiplyEngineer = findViewById(R.id.buttonMultiplyEngineer);
        Button buttonDivideEngineer = findViewById(R.id.buttonDivideEngineer);
        Button buttonEqualsEngineer = findViewById(R.id.buttonEqualsEngineer);
        Button buttonPointEngineer = findViewById(R.id.buttonPointEngineer);
        Button buttonOpenBasicCalculator = findViewById(R.id.buttonOpenBasicCalculator);
        Button buttonPercentEngineer = findViewById(R.id.buttonPercentEngineer);
        Button buttonClearEngineer = findViewById(R.id.buttonClearEngineer);
        Button buttonClearAllEngineer = findViewById(R.id.buttonClearAllEngineer);
        Button buttonDegree = findViewById(R.id.buttonDegree);
        tvResultEngineer = findViewById(R.id.tvResultEngineer);
        tvResultEngineer.setText("");
        calculations = "";

        buttonNumberOneEngineer.setOnClickListener(view -> {
                    calculations += "1";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonNumberTwoEngineer.setOnClickListener(view -> {
                    calculations += "2";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonNumberThreeEngineer.setOnClickListener(view -> {
                    calculations += "3";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonNumberFourEngineer.setOnClickListener(view -> {
                    calculations += "4";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonNumberFiveEngineer.setOnClickListener(view -> {
                    calculations += "5";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonNumberSixEngineer.setOnClickListener(view -> {
                    calculations += "6";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonNumberSevenEngineer.setOnClickListener(view -> {
                    calculations += "7";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonNumberEightEngineer.setOnClickListener(view -> {
                    calculations += "8";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonNumberNineEngineer.setOnClickListener(view -> {
                    calculations += "9";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonNumberZeroEngineer.setOnClickListener(view -> {
                    calculations += "0";
                    tvResultEngineer.setText(calculations);
                }
        );


        buttonPlusEngineer.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".")) {
                            calculations += " + ";
                            tvResultEngineer.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonMinusEngineer.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".")) {
                            calculations += " - ";
                            tvResultEngineer.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonMultiplyEngineer.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".")) {
                            calculations += " * ";
                            tvResultEngineer.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonDivideEngineer.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".")) {
                            calculations += " / ";
                            tvResultEngineer.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonPointEngineer.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".")) {
                            calculations += ".";
                            tvResultEngineer.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonPercentEngineer.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".")) {
                            calculations += " % ";
                            tvResultEngineer.setText(calculations);
                        }
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonClearEngineer.setOnClickListener(view -> {
                    try {
                        calculations = calculations.substring(0, calculations.length() - 1);
                        tvResultEngineer.setText(calculations);
                    } catch (StringIndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonClearAllEngineer.setOnClickListener(view -> {
                    calculations = "";
                    tvResultEngineer.setText(calculations);
                }
        );

        buttonEqualsEngineer.setOnClickListener(view -> {
                    try {
                        if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".")) {
                            calculations = String.valueOf(calculator.calculatorHandleLine(calculations)).replaceAll("\\.?0*$", "");
                            tvResultEngineer.setText(calculations);
                        }
                    } catch (IndexOutOfBoundsException s) {
                        System.out.println(s.getMessage());
                    }
                }
        );

        buttonOpenBasicCalculator.setOnClickListener(view -> {
            Intent intent = new Intent(this, BasicCalculator.class);
            startActivity(intent);
            intent.putExtra(key, calculations);
        });
        String bcCalculations = getIntent().getStringExtra(key);
        tvResultEngineer.setText(bcCalculations);

        buttonDegree.setOnClickListener(view -> {
            try {
                if (!calculations.substring(calculations.length() - 1).equals(" ") && !calculations.substring(calculations.length() - 1).equals(".")) {
                    calculations += " ^ ";
                    tvResultEngineer.setText(calculations);
                }
            } catch (StringIndexOutOfBoundsException s) {
                System.out.println(s.getMessage());
            }
        });
    }
}

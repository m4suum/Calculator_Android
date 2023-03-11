package com.example.calculator;

public class Calculator {
    private static LineHandler lineHandler = LineHandler.getLineHandler();
    private static Calculator calculator;

    private Calculator (){;
    }

    public static Calculator getCalculator() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }

    public float calculatorHandleLine(String calculations){
        return lineHandler.handleLine(calculations);
    }
}

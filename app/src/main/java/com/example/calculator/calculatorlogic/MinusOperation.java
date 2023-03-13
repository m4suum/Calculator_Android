package com.example.calculator.calculatorlogic;

public class MinusOperation {
    private static MinusOperation minusOperation;

    private MinusOperation() {
    }

    public static MinusOperation getMinusOperation() {
        if (minusOperation == null) {
            minusOperation = new MinusOperation();
        }
        return minusOperation;
    }

    public float minus(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }
}

package com.example.calculator;

public class PercentOperation {
    private static float resultNumber;
    private static PercentOperation percentOperation;

    private PercentOperation() {
    }

    public static PercentOperation getPercentOperation() {
        if (percentOperation == null) {
            percentOperation = new PercentOperation();
        }
        return percentOperation;
    }

    public float percent(float firstNumber, float secondNumber) {
        resultNumber = firstNumber * (secondNumber/100);
        return resultNumber;
    }
}

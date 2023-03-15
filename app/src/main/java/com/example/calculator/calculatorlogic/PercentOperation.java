package com.example.calculator.calculatorlogic;

public class PercentOperation {
    private static PercentOperation percentOperation;

    private PercentOperation() {
    }

    public static PercentOperation getPercentOperation() {
        if (percentOperation == null) {
            percentOperation = new PercentOperation();
        }
        return percentOperation;
    }

    public float percent(float number) {
        return number / 100;
    }
}

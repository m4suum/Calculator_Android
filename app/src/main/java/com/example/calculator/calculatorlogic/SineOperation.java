package com.example.calculator.calculatorlogic;

public class SineOperation {
    private static SineOperation sineOperation;

    private SineOperation() {
    }

    public static SineOperation getSineOperation() {
        if (sineOperation == null) {
            sineOperation = new SineOperation();
        }
        return sineOperation;
    }

    public float sin(float number) {
        return (float) Math.sin(Math.toRadians(number));
    }
}

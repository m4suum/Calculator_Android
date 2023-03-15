package com.example.calculator.calculatorlogic;

public class CosineOperation {
    private static CosineOperation cosineOperation;

    private CosineOperation() {
    }

    public static CosineOperation getCosineOperation() {
        if (cosineOperation == null) {
            cosineOperation = new CosineOperation();
        }
        return cosineOperation;
    }

    public float cos(float number) {
        return (float) Math.cos(Math.toRadians(number));
    }
}

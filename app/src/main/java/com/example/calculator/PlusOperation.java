package com.example.calculator;

public class PlusOperation {
    private static float resultNumber;
    private static PlusOperation plusOperation;

    private PlusOperation() {
    }

    public static PlusOperation getPlusOperation() {
        if (plusOperation == null) {
            plusOperation = new PlusOperation();
        }
        return plusOperation;
    }

    public float plus(float firstNumber, float secondNumber) {
        resultNumber = firstNumber + secondNumber;
        return resultNumber;
    }
}

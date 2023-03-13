package com.example.calculator.calculatorlogic;

public class PlusOperation {
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
        return firstNumber + secondNumber;
    }
}

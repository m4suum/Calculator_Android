package com.example.calculator;

public class MinusOperation {
    private static float resultNumber;
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
        resultNumber = firstNumber - secondNumber;
        return resultNumber;
    }
}

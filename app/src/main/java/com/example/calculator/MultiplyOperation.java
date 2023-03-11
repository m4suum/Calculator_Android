package com.example.calculator;

public class MultiplyOperation {
    private static float resultNumber;
    private static MultiplyOperation multiplyOperation;

    private MultiplyOperation() {
    }

    public static MultiplyOperation getMultiplyOperation() {
        if (multiplyOperation == null) {
            multiplyOperation = new MultiplyOperation();
        }
        return multiplyOperation;
    }
    public float multiply(float firstNumber, float secondNumber) {
        resultNumber = firstNumber * secondNumber;
        return resultNumber;
    }
}

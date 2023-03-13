package com.example.calculator.calculatorlogic;

public class MultiplyOperation {
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
        return firstNumber * secondNumber;
    }
}

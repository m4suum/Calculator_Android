package com.example.calculator.calculatorlogic;

public class DivideOperation {
    private static DivideOperation divideOperation;

    private DivideOperation() {
    }

    public static DivideOperation getDivideOperation() {
        if (divideOperation == null) {
            divideOperation = new DivideOperation();
        }
        return divideOperation;
    }

    public float divide(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }
}
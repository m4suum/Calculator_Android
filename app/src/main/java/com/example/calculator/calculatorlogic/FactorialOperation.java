package com.example.calculator.calculatorlogic;

public class FactorialOperation {
    private static FactorialOperation factorialOperation;

    private FactorialOperation() {
    }

    public static FactorialOperation getFactorialOperation() {
        if (factorialOperation == null) {
            factorialOperation = new FactorialOperation();
        }
        return factorialOperation;
    }

    public float factorial(float number) {
        if (number <= 1) {
            return 1;
        }
        else {
            return number * factorial(number - 1);
        }
    }
}

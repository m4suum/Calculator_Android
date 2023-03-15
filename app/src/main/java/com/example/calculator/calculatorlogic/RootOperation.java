package com.example.calculator.calculatorlogic;

public class RootOperation {
    private static RootOperation rootOperation;

    private RootOperation() {
    }

    public static RootOperation getRootOperation() {
        if (rootOperation == null) {
            rootOperation = new RootOperation();
        }
        return rootOperation;
    }

    public float root(float number) {
        return (float) Math.sqrt(number);
    }
}

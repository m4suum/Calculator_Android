package com.example.calculator.calculatorlogic;

public class DegreeOperation {
    private static DegreeOperation degreeOperation;

    private DegreeOperation() {
    }

    public static DegreeOperation getDegreeOperation() {
        if (degreeOperation == null) {
            degreeOperation = new DegreeOperation();
        }
        return degreeOperation;
    }

    public float degree(float firstNumber, float secondNumber) {
        return (float) Math.pow (firstNumber,secondNumber);
    }
}

package com.example.calculator;

public class DivideOperation {
    private static float resultNumber;
    private static DivideOperation divideOperation;

    private DivideOperation() {
    }

    public static DivideOperation getDivideOperation() {
        if (divideOperation == null) {
            divideOperation = new DivideOperation();
        }
        return divideOperation;
    }
    public float divide (float firstNumber, float secondNumber){
        resultNumber = firstNumber / secondNumber;
        if(secondNumber != 0)
            return resultNumber;
        else return 3.1415f;
    }
}
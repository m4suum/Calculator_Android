package com.example.calculator;

public class MinusOperation {
    private float firstNumber;
    private float secondNumber;
    private float resultNumber;


    public MinusOperation(float firstNumber, float secondNumber, float resultNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.resultNumber = resultNumber;
    }


    public float getResultNumber() {
        return resultNumber;
    }

    public void setResultNumber(float resultNumber) {
        this.resultNumber = resultNumber;
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }

    public float minus(float firstNumber, float secondNumber) {
        resultNumber = firstNumber - secondNumber;
        return resultNumber;
    }
}

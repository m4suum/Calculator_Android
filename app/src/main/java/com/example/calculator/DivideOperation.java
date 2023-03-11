package com.example.calculator;

public class DivideOperation {
    private float firstNumber;
    private float secondNumber;
    private float resultNumber;


    public DivideOperation(float firstNumber, float secondNumber, float resultNumber){
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

    public float divide (float firstNumber, float secondNumber){
        resultNumber = firstNumber / secondNumber;
        if(secondNumber != 0)
            return resultNumber;
        else return 3.1415f;
    }
}
package com.example.calculator;

public class PlusOperation {
    private Double firstNumber;
    private Double secondNumber;
    private Double resultNumber;


    public PlusOperation(Double firstNumber, Double secondNumber, Double resultNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.resultNumber = resultNumber;
    }


    public Double getResultNumber() {
        return resultNumber;
    }

    public void setResultNumber(Double resultNumber) {
        this.resultNumber = resultNumber;
    }

    public Double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Double plus(Double firstNumber, Double secondNumber) {
        resultNumber = firstNumber + secondNumber;
        return resultNumber;
    }
}

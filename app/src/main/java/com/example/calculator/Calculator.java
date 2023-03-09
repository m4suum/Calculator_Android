package com.example.calculator;

public class Calculator {
    private PlusOperation plusOperation;
    private MinusOperation minusOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;

    public Calculator (PlusOperation plusOperation, MinusOperation minusOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation){
        this.plusOperation = plusOperation;
        this.minusOperation = minusOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public PlusOperation getPlusOperation() {
        return plusOperation;
    }

    public void setPlusOperation(PlusOperation plusOperation) {
        this.plusOperation = plusOperation;
    }

    public MinusOperation getMinusOperation() {
        return minusOperation;
    }

    public void setMinusOperation(MinusOperation minusOperation) {
        this.minusOperation = minusOperation;
    }

    public MultiplyOperation getMultiplyOperation() {
        return multiplyOperation;
    }

    public void setMultiplyOperation(MultiplyOperation multiplyOperation) {
        this.multiplyOperation = multiplyOperation;
    }

    public DivideOperation getDivideOperation() {
        return divideOperation;
    }

    public void setDivideOperation(DivideOperation divideOperation) {
        this.divideOperation = divideOperation;
    }

    public String calculatorPlus (Double firstNumber, Double secondNumber){
        return String.valueOf(plusOperation.plus(firstNumber,secondNumber));
    }


    public String calculatorMinus (String firstNumber, String secondNumber){
        return String.valueOf(minusOperation.minus(Double.parseDouble(firstNumber),Double.parseDouble(secondNumber)));
    }
    public String calculatorMultiply (String firstNumber, String secondNumber){
        return String.valueOf(multiplyOperation.multiply(Double.parseDouble(firstNumber),Double.parseDouble(secondNumber)));
    }
    public String calculatorDivide (String firstNumber, String secondNumber){
        return String.valueOf(divideOperation.divide(Double.parseDouble(firstNumber),Double.parseDouble(secondNumber)));
    }
}

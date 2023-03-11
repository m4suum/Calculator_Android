package com.example.calculator;

public class Calculator {
    private LineHandler lineHandler;

    public Calculator (LineHandler lineHandler){

        this.lineHandler = lineHandler;
    }


    public LineHandler getLineHandler() {
        return lineHandler;
    }

    public void setLineHandler(LineHandler lineHandler) {
        this.lineHandler = lineHandler;
    }
    public float calculatorHandleLine(String calculations){
        return lineHandler.handleLine(calculations);
    }
}

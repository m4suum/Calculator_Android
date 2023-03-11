package com.example.calculator;

import java.util.ArrayList;

public class LineHandler {
    private String lineOfCalculations;
    private float result;
    private PlusOperation plusOperation = new PlusOperation(0,0,0);
    private MinusOperation minusOperation = new MinusOperation(0, 0 , 0);
    private MultiplyOperation multiplyOperation = new MultiplyOperation(0, 0, 0);
    private DivideOperation divideOperation = new DivideOperation(0, 0, 0);

    public LineHandler (String lineOfCalculations, float result){
        this.lineOfCalculations = lineOfCalculations;
        this.result = result;
    }

    public String getLineOfCalculations() {
        return lineOfCalculations;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public void setLineOfCalculations(String lineOfCalculations) {
        this.lineOfCalculations = lineOfCalculations;
    }

    public float handleLine (String lineOfCalculations){
        result = 0;
        int count = 1;
        String[] strings = lineOfCalculations.split(" ");
        ArrayList<Float> nums = new ArrayList<>();
        for (String num : strings) {
            if (!num.equals("+") && !num.equals("-") && !num.equals("*") && !num.equals("/") && !num.equals("%"))
                nums.add(Float.valueOf(num));
        }
        ArrayList<String> operations = new ArrayList<>();
        for (String operation : strings) {
            if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("%"))
                operations.add(operation);
        }

        switch (operations.get(0)) {
            case "+":
                result = plusOperation.plus(nums.get(0), nums.get(1));
                break;
            case "-":
                result = minusOperation.minus(nums.get(0) , nums.get(1));
                break;
            case "*":
                result = multiplyOperation.multiply(nums.get(0), nums.get(1));
                break;
            case "/":
                result = divideOperation.divide(nums.get(0), nums.get(1));
                break;
            case "%":
                result = nums.get(0) * (nums.get(1) / 100);
                break;
        }
        for (int i = 2; i < nums.size(); i++) {
            switch (operations.get(count)) {
                case "+":
                    result = plusOperation.plus(result, nums.get(i));
                    break;
                case "-":
                    result = minusOperation.minus(result, nums.get(i));
                    break;
                case "*":
                    result = multiplyOperation.multiply(result, nums.get(i));
                    break;
                case "/":
                    result = divideOperation.divide(result, nums.get(i));
                    break;
                case "%":
                    result *= nums.get(i) / 100;
                    break;
            }
            count++;
        }
        return result;
    }
}

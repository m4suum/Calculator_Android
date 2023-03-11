package com.example.calculator;

import java.util.ArrayList;

public class LineHandler {
    private static float result;
    private static PlusOperation plusOperation = PlusOperation.getPlusOperation();
    private static MinusOperation minusOperation = MinusOperation.getMinusOperation();
    private static MultiplyOperation multiplyOperation = MultiplyOperation.getMultiplyOperation();
    private static DivideOperation divideOperation = DivideOperation.getDivideOperation();
    private static PercentOperation percentOperation = PercentOperation.getPercentOperation();
    private static LineHandler lineHandler;

    private LineHandler (){
    }

    public static LineHandler getLineHandler() {
        if (lineHandler == null) {
            lineHandler = new LineHandler();
        }
        return lineHandler;
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
                result = percentOperation.percent(nums.get(0), nums.get(1));
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
                    result = percentOperation.percent(result, nums.get(i));
                    break;
            }
            count++;
        }
        return result;
    }
}

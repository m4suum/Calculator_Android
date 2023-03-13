package com.example.calculator.calculatorlogic;

import java.util.ArrayList;

public class LineHandler {
    private static final PlusOperation plusOperation = PlusOperation.getPlusOperation();
    private static final MinusOperation minusOperation = MinusOperation.getMinusOperation();
    private static final MultiplyOperation multiplyOperation = MultiplyOperation.getMultiplyOperation();
    private static final DivideOperation divideOperation = DivideOperation.getDivideOperation();
    private static final PercentOperation percentOperation = PercentOperation.getPercentOperation();
    private static final DegreeOperation degreeOperation = DegreeOperation.getDegreeOperation();
    private static LineHandler lineHandler;

    private LineHandler() {
    }

    public static LineHandler getLineHandler() {
        if (lineHandler == null) {
            lineHandler = new LineHandler();
        }
        return lineHandler;
    }

    public float handleLine(String lineOfCalculations) {
        float result = 0;
        int count = 1;
        String[] strings = lineOfCalculations.split(" ");
        ArrayList<Float> numbers = new ArrayList<>();
        ArrayList<String> operations = new ArrayList<>();
        for (String element : strings) {
            if (element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/") || element.equals("%") || element.equals("^"))
                operations.add(element);
            else numbers.add(Float.valueOf(element));
        }

        switch (operations.get(0)) {
            case "+":
                result = plusOperation.plus(numbers.get(0), numbers.get(1));
                break;
            case "-":
                result = minusOperation.minus(numbers.get(0), numbers.get(1));
                break;
            case "*":
                result = multiplyOperation.multiply(numbers.get(0), numbers.get(1));
                break;
            case "/":
                result = divideOperation.divide(numbers.get(0), numbers.get(1));
                break;
            case "%":
                result = percentOperation.percent(numbers.get(0), numbers.get(1));
                break;
            case "^":
                result = degreeOperation.degree(numbers.get(0), numbers.get(1));
                break;
        }
        for (int i = 2; i < numbers.size(); i++) {
            switch (operations.get(count)) {
                case "+":
                    result = plusOperation.plus(result, numbers.get(i));
                    break;
                case "-":
                    result = minusOperation.minus(result, numbers.get(i));
                    break;
                case "*":
                    result = multiplyOperation.multiply(result, numbers.get(i));
                    break;
                case "/":
                    result = divideOperation.divide(result, numbers.get(i));
                    break;
                case "%":
                    result = percentOperation.percent(result, numbers.get(i));
                    break;
                case "^":
                    result = degreeOperation.degree(result, numbers.get(i));
                    break;
            }
            count++;
        }
        return result;
    }
}

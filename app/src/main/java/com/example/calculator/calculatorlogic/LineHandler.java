package com.example.calculator.calculatorlogic;

import java.util.ArrayList;
import java.util.Arrays;

public class LineHandler {
    private static final PlusOperation plusOperation = PlusOperation.getPlusOperation();
    private static final MinusOperation minusOperation = MinusOperation.getMinusOperation();
    private static final MultiplyOperation multiplyOperation = MultiplyOperation.getMultiplyOperation();
    private static final DivideOperation divideOperation = DivideOperation.getDivideOperation();
    private static final PercentOperation percentOperation = PercentOperation.getPercentOperation();
    private static final DegreeOperation degreeOperation = DegreeOperation.getDegreeOperation();
    private static final RootOperation rootOperation = RootOperation.getRootOperation();
    private static final FactorialOperation factorialOperation = FactorialOperation.getFactorialOperation();
    private static final SineOperation sineOperation = SineOperation.getSineOperation();
    private static final CosineOperation cosineOperation = CosineOperation.getCosineOperation();
    private static LineHandler lineHandler;

    private LineHandler() {
    }

    public static LineHandler getLineHandler() {
        if (lineHandler == null) {
            lineHandler = new LineHandler();
        }
        return lineHandler;
    }

    public String handleLine(String lineOfCalculations) {
        float firstResult;
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(lineOfCalculations.split(" ")));

        for (int i = strings.size() - 1; i >= 0; i--) {
            switch (strings.get(i)) {
                case "sin" -> {
                    firstResult = sineOperation.sin(Float.parseFloat(strings.get(i + 1)));
                    strings.remove(i);
                    strings.add(i, String.valueOf(firstResult));
                    strings.remove(i + 1);
                }
                case "cos" -> {
                    firstResult = cosineOperation.cos(Float.parseFloat(strings.get(i + 1)));
                    strings.remove(i);
                    strings.add(i, String.valueOf(firstResult));
                    strings.remove(i + 1);
                }
                case "√" -> {
                    firstResult = rootOperation.root(Float.parseFloat(strings.get(i + 1)));
                    strings.remove(i);
                    strings.add(i, String.valueOf(firstResult));
                    strings.remove(i + 1);
                }
                case "!" -> {
                    firstResult = factorialOperation.factorial(Float.parseFloat(strings.get(i - 1)));
                    strings.remove(i);
                    strings.add(i, String.valueOf(firstResult));
                    strings.remove(i - 1);
                }
                case "%" -> {
                    firstResult = percentOperation.percent(Float.parseFloat(strings.get(i - 1)));
                    strings.remove(i);
                    strings.add(i, String.valueOf(firstResult));
                    strings.remove(i - 1);
                }
            }
        }

        for (int i = strings.size() - 1; i >= 0; i--) {
            switch (strings.get(i)) {
                case "*" -> {
                    firstResult = multiplyOperation.multiply(Float.parseFloat(strings.get(i + 1)), Float.parseFloat(strings.get(i - 1)));
                    strings.remove(i);
                    strings.add(i, String.valueOf(firstResult));
                    strings.remove(i + 1);
                    strings.remove(i - 1);
                }
                case "/" -> {
                    firstResult = divideOperation.divide(Float.parseFloat(strings.get(i - 1)), Float.parseFloat(strings.get(i + 1)));
                    strings.remove(i);
                    strings.add(i, String.valueOf(firstResult));
                    strings.remove(i + 1);
                    strings.remove(i - 1);
                }
                case "^" -> {
                    firstResult = degreeOperation.degree(Float.parseFloat(strings.get(i - 1)), Float.parseFloat(strings.get(i + 1)));
                    strings.remove(i);
                    strings.add(i, String.valueOf(firstResult));
                    strings.remove(i + 1);
                    strings.remove(i - 1);
                }
            }
        }

        float finalResult = Float.parseFloat(strings.get(0));
        for (int i = 0; i < strings.size() - 1; i++) {
            switch (strings.get(i)) {
                case "+" ->
                        finalResult = plusOperation.plus(finalResult, Float.parseFloat(strings.get(i + 1)));
                case "-" ->
                        finalResult = minusOperation.minus(finalResult, Float.parseFloat(strings.get(i + 1)));
            }
        }
        return String.valueOf(finalResult);
    }
}

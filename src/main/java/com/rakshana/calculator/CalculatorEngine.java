package com.rakshana.calculator;

/**
 * Calculator Engine - Handles calculator logic
 */
public class CalculatorEngine {

    private double firstNumber = 0;
    private double secondNumber = 0;
    private String operation = "";
    private boolean isNewNumber = true;

    public String processInput(String input, String currentDisplay) {
        String display = currentDisplay.equals("0") ? "" : currentDisplay;

        switch (input) {
            case "C":
            case "Clear":
                reset();
                return "0";
            case "Back":
                return display.isEmpty() ? "0" : display.substring(0, display.length() - 1);
            case "+":
            case "-":
            case "*":
            case "/":
                if (!display.isEmpty()) {
                    firstNumber = Double.parseDouble(display);
                    operation = input;
                    isNewNumber = true;
                }
                return display;
            case "=":
                if (!display.isEmpty() && !operation.isEmpty()) {
                    secondNumber = Double.parseDouble(display);
                    double result = calculate(firstNumber, secondNumber, operation);
                    reset();
                    return String.valueOf(result);
                }
                return display;
            case ".":
                if (!display.contains(".")) {
                    return display + ".";
                }
                return display;
            default:
                // Number
                if (isNewNumber) {
                    isNewNumber = false;
                    return input;
                } else {
                    return display + input;
                }
        }
    }

    private double calculate(double a, double b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return b != 0 ? a / b : 0;
            default:
                return 0;
        }
    }

    private void reset() {
        firstNumber = 0;
        secondNumber = 0;
        operation = "";
        isNewNumber = true;
    }
}

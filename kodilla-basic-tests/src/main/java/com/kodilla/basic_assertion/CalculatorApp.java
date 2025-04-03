package com.kodilla.basic_assertion;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 4;
        int subtractResult = calculator.subtract(a, b);
        boolean correct = ResultChecker.assertEquals(6, subtractResult);
        if (correct) {
            System.out.println("The subtract method works correctly for numbers " + a + " i " + b);
        } else {
            System.out.println("The subtract method does not work correctly for numbers " + a + " i " + b);
        }
        a = 5;
        b = 8;
        int sumResult = calculator.sum(a, b);
        correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("The sum method works correctly for numbers " + a + " i " + b);
        } else {
            System.out.println("The sum method does not work correctly for numbers " + a + " i " + b);
        }
    }
}

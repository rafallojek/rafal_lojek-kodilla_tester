package com.kodilla.basic_assertion;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }

    public double power(int a) {
        return a * a;
    }

    public double incorrectPower(int a) {
        return a + a;
    }

    public int sum(int a, int b) {
        return a;
    }
}

package com.kodilla.basic_assertion.homework;

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
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public double power(double a) {
        return a * a;
    }

    public double incorrectPower(double a) {
        return a + a;
    }

    public int sum(int i, int i1) {
        return i;
    }
}

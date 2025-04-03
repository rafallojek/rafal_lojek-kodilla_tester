package com.kodilla.basic_assertion.homework;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultSubtract = calculator.subtract(37, 36);
        System.out.println("37 - 36 = " + resultSubtract);
        if (resultSubtract == 1) {
            System.out.println("Subtraction correct.");
        } else {
            System.out.println("Subtraction incorrect.");
        }

        int resultSquare = calculator.square(5);
        System.out.println("5^2 = " + resultSquare);
        if (resultSquare == 25) {
            System.out.println("Squaring correct.");
        } else {
            System.out.println("Squaring is incorrect.");
        }
    }
}
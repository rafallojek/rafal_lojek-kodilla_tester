package com.kodilla.basic_assertion.homework;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition 8 + 2 = " + calculator.add(8, 2));
        System.out.println("Subtraction 10 - 3 = " + calculator.subtract(10, 3));
        System.out.println("Multiplication 7 * 6 = " + calculator.multiply(7, 6));
        System.out.println("Division 20 / 4 = " + calculator.divide(20, 4));
        System.out.println("Power of 5 = " + calculator.power(5));
        System.out.println("Incorrect power of 5 = " + calculator.incorrectPower(5));
    }
}


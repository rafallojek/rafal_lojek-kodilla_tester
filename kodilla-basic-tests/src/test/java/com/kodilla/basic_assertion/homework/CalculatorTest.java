package com.kodilla.basic_assertion.homework;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        calculator.sum(2, 2);
    }
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        calculator.subtract(4, 2);
    }
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        calculator.multiply(3, 3);
    }
}
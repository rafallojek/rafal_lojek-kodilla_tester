package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        calculator.sum(1, 1);
    }
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        calculator.subtract(2, 1);
    }
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        calculator.multiply(3, 3);
    }
}
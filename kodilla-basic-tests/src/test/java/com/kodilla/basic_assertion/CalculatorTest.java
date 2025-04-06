package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(37, 36));
    }

    @Test
    void testSquarePositive() {
        assertEquals(25.0, calculator.square(5), 0.0001);
    }

    @Test
    void testSquareZero() {
        assertEquals(0.0, calculator.square(0), 0.0001);
    }

    @Test
    void testSquareNegative() {
        assertEquals(9.0, calculator.square(-3), 0.0001);
    }
}

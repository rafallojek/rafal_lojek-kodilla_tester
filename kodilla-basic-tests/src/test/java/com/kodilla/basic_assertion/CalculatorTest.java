package com.kodilla.basic_assertion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void setupAll() {
        System.out.println(">>> Starting Calculator Tests <<<");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println(">>> Calculator Tests Finished <<<");
    }

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @AfterEach
    void afterEach() {
        System.out.println("--- Single test completed ---");
    }

    @Test
    void testAddition() {
        int result = calculator.add(8, 2);
        assertEquals(10, result, "Addition should be correct");
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(10, 3);
        assertEquals(7, result, "Subtraction should be correct");
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(7, 6);
        assertEquals(42, result, "Multiplication should be correct");
    }

    @Test
    void testDivision() {
        double result = calculator.divide(20, 4);
        assertEquals(5.0, result, 0.0001, "Division should be correct");
    }

    @Test
    void testDivisionByZero() {
        calculator.divide(5, 0);
    }

    @Test
    void testPowerPositive() {
        double result = calculator.power(5);
        assertEquals(25.0, result, 0.0001, "Power for positive number should be correct");
    }

    @Test
    void testPowerZero() {
        double result = calculator.power(0);
        assertEquals(0.0, result, 0.0001, "Power for zero should be zero");
    }

    @Test
    void testPowerNegative() {
        double result = calculator.power(-3);
        assertEquals(9.0, result, 0.0001, "Power for negative number should be correct");
    }

    @Test
    void testIncorrectPower() {
        double result = calculator.incorrectPower(5);
        assertNotEquals(25.0, result, 0.0001, "Incorrect power should not be correct");
    }
}


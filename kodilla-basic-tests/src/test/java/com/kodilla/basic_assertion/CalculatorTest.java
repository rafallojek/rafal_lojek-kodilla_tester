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
        // given
        int a = 8;
        int b = 2;

        // when
        int result = calculator.add(a, b);

        // then
        assertEquals(10, result, "Addition should be correct");
    }

    @Test
    void testSubtraction() {
        // given
        int a = 10;
        int b = 3;

        // when
        int result = calculator.subtract(a, b);

        // then
        assertEquals(7, result, "Subtraction should be correct");
    }

    @Test
    void testMultiplication() {
        // given
        int a = 7;
        int b = 6;

        // when
        int result = calculator.multiply(a, b);

        // then
        assertEquals(42, result, "Multiplication should be correct");
    }

    @Test
    void testDivision() {
        // given
        int a = 20;
        int b = 4;

        // when
        double result = calculator.divide(a, b);

        // then
        assertEquals(5.0, result, 0.0001, "Division should be correct");
    }

    @Test
    void testDivisionByZero() {
        // given
        int a = 5;
        int b = 0;

        // when & then
        assertThrows(ArithmeticException.class, () -> calculator.divide(a, b), "Division by zero should throw an exception");
    }

    @Test
    void testPowerPositive() {
        // given
        int a = 5;

        // when
        double result = calculator.power(a);

        // then
        assertEquals(25.0, result, 0.0001, "Power for positive number should be correct");
    }

    @Test
    void testPowerZero() {
        // given
        int a = 0;

        // when
        double result = calculator.power(a);

        // then
        assertEquals(0.0, result, 0.0001, "Power for zero should be zero");
    }

    @Test
    void testPowerNegative() {
        // given
        int a = -3;

        // when
        double result = calculator.power(a);

        // then
        assertEquals(9.0, result, 0.0001, "Power for negative number should be correct");
    }

    @Test
    void testIncorrectPower() {
        // given
        int a = 5;

        // when
        double result = calculator.incorrectPower(a);

        // then
        assertNotEquals(25.0, result, 0.0001, "Incorrect power should not be correct");
    }
}

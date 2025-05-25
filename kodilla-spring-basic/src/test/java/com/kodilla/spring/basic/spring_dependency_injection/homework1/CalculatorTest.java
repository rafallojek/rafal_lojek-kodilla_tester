package com.kodilla.spring.basic.spring_dependency_injection.homework1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        // given
        double a = 12.3;
        double b = 5.7;

        // when
        double result = calculator.add(a, b);

        // then
        System.out.println("The result of the addition is: " + result);
        assertEquals(18.0, result, 0.001);
    }

    @Test
    public void testSubtract() {
        // given
        double a = 100;
        double b = 45.5;

        // when
        double result = calculator.subtract(a, b);

        // then
        System.out.println("The result of subtraction is: " + result);
        assertEquals(54.5, result, 0.001);
    }

    @Test
    public void testMultiply() {
        // given
        double a = 6.2;
        double b = 3.1;

        // when
        double result = calculator.multiply(a, b);

        // then
        System.out.println("The result of multiplication is: " + result);
        assertEquals(19.22, result, 0.001);
    }

    @Test
    public void testDivide() {
        // given
        double a = 81.0;
        double b = 9.0;

        // when
        double result = calculator.divide(a, b);

        // then
        System.out.println("The result of the division is: " + result);
        assertEquals(9.0, result, 0.001);
    }
}

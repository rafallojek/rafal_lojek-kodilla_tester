package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a, b);  // poprawiona nazwa metody
        assertEquals(13, sumResult);
    }
}

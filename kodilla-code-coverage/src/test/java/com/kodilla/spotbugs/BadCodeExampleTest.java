package com.kodilla.spotbugs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadCodeExampleTest {

    @Test
    void shouldReturnPi() {
        assertEquals(Math.PI, BadCodeExample.getPi(), 0.0001);
    }

    @Test
    void shouldReturnType() {
        BadCodeExample example = new BadCodeExample("TEST");
        assertEquals("TEST", example.getType());
    }

    @Test
    void shouldCompareObjectsCorrectly() {
        BadCodeExample e1 = new BadCodeExample("TYPE");
        BadCodeExample e2 = new BadCodeExample("TYPE");
        assertEquals(e1, e2);
        assertEquals(e1.hashCode(), e2.hashCode());
    }
}

package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

class ConvertibleTest {
    @Test
    void testConvertible() {
        Convertible convertible = new Convertible(4, 120);
        convertible.openRoof();
        convertible.closeRoof();
        convertible.turnOn();
        convertible.turnOff();
    }
}
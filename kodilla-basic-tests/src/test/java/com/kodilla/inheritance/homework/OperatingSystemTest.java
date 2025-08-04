package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;

class OperatingSystemTest {
    @Test
    void testOperatingSystem() {
        OperatingSystem os = new OperatingSystem(2020);
        os.turnOn();
        os.turnOff();
    }
}
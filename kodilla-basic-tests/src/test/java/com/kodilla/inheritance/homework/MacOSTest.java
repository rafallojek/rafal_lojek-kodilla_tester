package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;

class MacOSTest {
    @Test
    void testMacOS() {
        MacOS mac = new MacOS(2021);
        mac.turnOn();
        mac.turnOff();
    }
}
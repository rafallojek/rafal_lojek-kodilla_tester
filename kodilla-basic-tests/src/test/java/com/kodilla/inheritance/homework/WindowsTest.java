package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;

class WindowsTest {
    @Test
    void testWindows() {
        Windows win = new Windows(2019);
        win.turnOn();
        win.turnOff();
    }
}
package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;

class LinuxTest {
    @Test
    void testLinux() {
        Linux linux = new Linux(2018);
        linux.turnOn();
        linux.turnOff();
    }
}
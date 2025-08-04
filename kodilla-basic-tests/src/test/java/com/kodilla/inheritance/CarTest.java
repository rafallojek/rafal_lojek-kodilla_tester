package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void testCar() {
        Car car = new Car(4, 100);
        car.turnOn();
        car.turnOff();
    }
}
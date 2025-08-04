package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

class CircleTest {
    @Test
    void testCircle() {
        Circle circle = new Circle(3);
        circle.calculateArea();
        circle.calculatePerimeter();
    }
}
package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(2, 5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

class TriangleTest {
    @Test
    void testTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
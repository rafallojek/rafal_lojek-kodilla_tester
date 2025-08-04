package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

class ShapeTest {
    @Test
    void testShape() {
        Shape shape = new Shape(){
            @Override
            public double calculateArea() { return 0; }
            @Override
            public double calculatePerimeter() { return 0; }
        };
        shape.calculateArea();
        shape.calculatePerimeter();
    }
}
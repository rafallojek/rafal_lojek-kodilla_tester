package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class RandomShapesGenerator {

    public static Shape[] generateRandomShapes() {
        Random random = new Random();
        int numberOfShapes = random.nextInt(20) + 1; // losujemy 1-20 elementów
        Shape[] shapes = new Shape[numberOfShapes];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = drawShape(random);
        }
        return shapes;
    }

    private static Shape drawShape(Random random) {
        int drawnShapeKind = random.nextInt(3); // 0, 1 lub 2
        double a = random.nextDouble() * 100 + 1; // bok lub promień od 1.0 do 100.999...

        switch (drawnShapeKind) {
            case 0:
                return new Circle(a);
            case 1:
                return new Square(a);
            default:
                double b = random.nextDouble() * 100 + 1;
                double c = random.nextDouble() * 100 + 1;
                return new Triangle(a, b, c);
        }
    }
}

package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeUtils {
    public static void displayShapeInfo(Shape shape) {
        System.out.println("-----------------------------");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape perimeter: " + shape.getPerimeter());
    }

    private static String getShapeName(Shape shape) {
        if (shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Triangle)
            return "Triangle";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Unknown shape name";
    }

    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);
        return null;
    }
}

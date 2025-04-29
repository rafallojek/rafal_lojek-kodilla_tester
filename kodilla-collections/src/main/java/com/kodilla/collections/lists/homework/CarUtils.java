package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static String describeCar(Car car) {
        return car.toString() + " - current speed: " + car.getSpeed() + " km/h";
    }
}

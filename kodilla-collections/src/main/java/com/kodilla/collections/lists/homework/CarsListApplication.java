package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car hyundai = new Hyundai();
        Car volkswagen = new Volkswagen();
        Car audi = new Audi();

        cars.add(hyundai);
        cars.add(volkswagen);
        cars.add(audi);

        hyundai.increaseSpeed();
        hyundai.increaseSpeed();
        volkswagen.increaseSpeed();
        audi.increaseSpeed();
        audi.increaseSpeed();
        audi.increaseSpeed();

        System.out.println("Car List:");
        for (Car car : cars) {
            System.out.println(CarUtils.describeCar(car));
        }

        cars.remove(1);

        cars.remove(audi);

        System.out.println("List of cars after removal:");
        for (Car car : cars) {
            System.out.println(CarUtils.describeCar(car));
        }
        System.out.println("List Size: " + cars.size());
    }
}

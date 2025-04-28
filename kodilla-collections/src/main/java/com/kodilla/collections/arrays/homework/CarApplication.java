package com.kodilla.collections.arrays.homework;

import java.util.Random;

public class CarApplication {

    public static Car drawCar() {
        Random random = new Random();
        String[] brands = {"Hyundai", "Volkswagen", "Audi", "Renault", "Citroen"};
        String[] models = {"i30", "Polo", "A3", "Megane", "Berlingo"};

        int index = random.nextInt(brands.length);
        int baseSpeed = 100 + random.nextInt(101);
        int speedBoost = random.nextInt(51);

        return new Car(brands[index], models[index], baseSpeed + speedBoost);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 1 + random.nextInt(15);

        Car[] cars = new Car[arraySize];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}

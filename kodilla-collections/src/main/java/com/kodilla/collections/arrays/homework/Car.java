package com.kodilla.collections.arrays.homework;

public class Car {
    private String brand;
    private String model;
    private int maxSpeed;

    public Car(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}


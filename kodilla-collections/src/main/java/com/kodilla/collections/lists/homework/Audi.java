package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class Audi implements Car {
    private int speed = 0;
    private final String name = "Audi";

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        speed = Math.max(0, speed - 20);
    }

    @Override
    public String toString() {
        return name;
    }
}

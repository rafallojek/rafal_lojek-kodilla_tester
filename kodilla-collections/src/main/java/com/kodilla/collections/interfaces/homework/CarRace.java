package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car volkswagen = new Volkswagen();
        Car audi = new Audi();
        Car hyundai = new Hyundai();

        System.out.println("Volkswagen race:");
        doRace(volkswagen);

        System.out.println("Audi race:");
        doRace(audi);

        System.out.println("Hyundai race:");
        doRace(hyundai);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Final speed: " + car.getSpeed() + " km/h");
    }
}


package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("System on");
    }

    public void turnOff() {
        System.out.println("System off. You can now safely turn off your computer");
    }

    public int getYear() {
        return year;
    }
}
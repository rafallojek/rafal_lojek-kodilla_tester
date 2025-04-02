package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {
    public MacOS(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("System MacOS is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("System MacOS is shutting down");
    }
}
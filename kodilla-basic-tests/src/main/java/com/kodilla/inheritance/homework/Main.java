package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows(2021);
        MacOS macos= new MacOS(2025);
        Linux linux = new Linux(2024);

        System.out.println("Year of system Windows last release: " + windows.getYear());
        windows.turnOn();
        windows.turnOff();

        System.out.println("Year of system MacOS last release: " + macos.getYear());
        macos.turnOn();
        macos.turnOff();

        System.out.println("Year of system Linux last release: " + linux.getYear());
        linux.turnOn();
        linux.turnOff();

    }
}
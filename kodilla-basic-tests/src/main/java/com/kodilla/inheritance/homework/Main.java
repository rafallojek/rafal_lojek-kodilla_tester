package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows(2021);
        MacOS macos= new MacOS(2025);
        Linux linux = new Linux(2024);

        System.out.println("Year of system Windows last release: " + windows.year());
        windows.turnOn();
        windows.turnoff();

        System.out.println("Year of system MacOS last release: " + macos.year());
        macos.turnOn();
        macos.turnoff();

        System.out.println("Year of system Linux last release: " + linux.year());
        linux.turnOn();
        linux.turnoff();

    }
}
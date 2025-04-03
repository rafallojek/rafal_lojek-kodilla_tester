package com.kodilla.abstracts.homework;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, new Developer());
        Person person2 = new Person("Bob", 40, new Teacher());
        Person person3 = new Person("Alex", 33, new Doctor());

        person1.showResponsibilities();
        person2.showResponsibilities();
        person3.showResponsibilities();
    }
}
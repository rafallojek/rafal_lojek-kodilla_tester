package com.kodilla.abstracts.homework;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jacob", 27, new Developer());
        Person person2 = new Person("Martin", 44, new Teacher());
        Person person3 = new Person("Alex", 33, new Doctor());

        person1.showResponsibilities();
        person2.showResponsibilities();
        person3.showResponsibilities();
    }
}
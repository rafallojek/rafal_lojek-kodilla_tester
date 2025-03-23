package com.kodilla;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        User[] users = {
                new User("Rafal", 37),
                new User("Joanna", 36),
                new User("Aleksandra", 44),
                new User("Maciej", 32),
                new User("Jaroslaw", 26)
        };

        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        double averageAge = (double) sum / users.length;

        System.out.println("Uzytkownicy ponizej sredniej wieku:");
        for (User user : users) {
            if (user.getAge() < averageAge) {
                System.out.println(user.getName());
            }
        }
    }
}




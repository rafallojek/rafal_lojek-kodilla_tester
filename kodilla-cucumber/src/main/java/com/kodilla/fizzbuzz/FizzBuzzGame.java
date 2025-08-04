package com.kodilla.fizzbuzz;

public class FizzBuzzGame {
    public static String checkNumber(int number) {
        if (number % 15 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return "None";
    }

    public void play(int i, int i1) {

    }
}

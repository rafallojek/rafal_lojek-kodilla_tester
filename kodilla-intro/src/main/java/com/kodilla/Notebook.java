package com.kodilla;

class Notebook {
    int price;
    int weight;
    int year;

    public Notebook(int price, int weight, int year) {
        this.price = price;
        this.weight = weight;
        this.year = year;
    }

    public void checkPrice() {
        if (price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (price >= 600 && price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (weight >= 1000 && weight <= 2000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (year > 2018 && price > 1500) {
            System.out.println("This is a modern and expensive notebook.");
        } else if (year > 2015 && price <= 1500) {
            System.out.println("This is a relatively modern notebook at a reasonable price.");
        } else {
            System.out.println("This notebook is quite old or very cheap.");
        }
    }
}

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(500, 900, 2020);
        Notebook notebook2 = new Notebook(800, 1500, 2017);
        Notebook notebook3 = new Notebook(1600, 2200, 2019);

        System.out.println("Notebook 1:");
        notebook1.checkPrice();
        notebook1.checkWeight();
        notebook1.checkYearAndPrice();

        System.out.println("\nNotebook 2:");
        notebook2.checkPrice();
        notebook2.checkWeight();
        notebook2.checkYearAndPrice();

        System.out.println("\nNotebook 3:");
        notebook3.checkPrice();
        notebook3.checkWeight();
        notebook3.checkYearAndPrice();
    }
}

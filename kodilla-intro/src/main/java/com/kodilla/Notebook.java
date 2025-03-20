package com.kodilla;

public class Notebook {
    private int price;
    private double weight;
    private int year;

    public Notebook(int price, double weight, int year) {
        this.price = price;
        this.weight = weight;
        this.year = year;
    }

    public void checkPrice() {
        if (price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (weight < 1.5) {
            System.out.println("This device is lightweight.");
        } else if (weight <= 2.5) {
            System.out.println("This device is not too heavy.");
        } else {
            System.out.println("This device is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (year > 2018 && price > 1500) {
            System.out.println("This is a modern and expensive notebook.");
        } else if (year <= 2018 && price > 1500) {
            System.out.println("This notebook is expensive but quite old.");
        } else if (year > 2018 && price <= 1500) {
            System.out.println("This is a modern and affordable notebook.");
        } else {
            System.out.println("This is an older, budget-friendly notebook.");
        }
    }

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(500, 1.2, 2020);
        Notebook notebook2 = new Notebook(900, 2.0, 2015);
        Notebook notebook3 = new Notebook(1600, 3.0, 2019);

        notebook1.checkPrice();
        notebook1.checkWeight();
        notebook1.checkYearAndPrice();

        notebook2.checkPrice();
        notebook2.checkWeight();
        notebook2.checkYearAndPrice();

        notebook3.checkPrice();
        notebook3.checkWeight();
        notebook3.checkYearAndPrice();
    }
}


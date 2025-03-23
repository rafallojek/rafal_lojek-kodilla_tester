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
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1000 && this.weight <= 2000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year > 2018 && this.price > 1500) {
            System.out.println("This is a modern and expensive notebook.");
        } else if (this.year < 2010 && this.price < 800) {
            System.out.println("This notebook is quite old and affordable.");
        } else {
            System.out.println("This notebook has a balanced price and age.");
        }
    }
}
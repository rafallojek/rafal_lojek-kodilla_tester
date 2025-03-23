package com.kodilla;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(500, 1200, 2015);
        Notebook notebook2 = new Notebook(900, 1500, 2020);
        Notebook notebook3 = new Notebook(1600, 2200, 2022);

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
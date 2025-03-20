package com.kodilla;

public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[] {"Maciej", "Jarek", "Kamil", "Marcin", "Michał"};
        String name = names[0];
        System.out.println(name);

        int arrayLength = names.length;
        System.out.println(("Moja tablica zawiera " + arrayLength + " elementow."));
    }
}


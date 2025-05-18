package com.kodilla.homework_two;

public class Main {
    public static void main(String[] args) {
        StringCollection collection = new StringCollection();

        collection.addElement("Apple");
        collection.addElement("Pear");
        collection.addElement("Plum");
        collection.addElement("Apricot");

        System.out.println("Element 0: " + collection.getElement(0));
        System.out.println("Element 2: " + collection.getElement(2));

        System.out.println("Removing 'Pear': " + collection.removeElement("Pear"));
        System.out.println("Element 1 after removal: " + collection.getElement(1));

        System.out.println("Attempted deletion 'Banana': " + collection.removeElement("Banan"));
    }
}

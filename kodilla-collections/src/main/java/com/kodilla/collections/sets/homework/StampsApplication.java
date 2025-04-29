package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        Stamp stamp1 = new Stamp("Lublin Poland 1988", 30, 40, false);
        Stamp stamp2 = new Stamp("Lublin Poland 1988", 30, 40, false); // Duplicate stamp1
        Stamp stamp3 = new Stamp("Paris France 2009", 25, 35, true);
        Stamp stamp4 = new Stamp("Hamburg Germany 2014", 28, 38, false);
        Stamp stamp5 = new Stamp("Paris France 2009", 25, 35, true); // Duplicate stamp3
        Stamp stamp6 = new Stamp("Prague Czech Republic 2019", 35, 20, true);
        Stamp stamp7 = new Stamp("Brno Czech Republic 2018", 37, 23, false);
        Stamp stamp8 = new Stamp("Berlin Germany 2015", 33, 27, false);

        stamps.add(stamp1);
        stamps.add(stamp2); // Duplicate stamp1
        stamps.add(stamp3);
        stamps.add(stamp4);
        stamps.add(stamp5); // Duplicate stamp3
        stamps.add(stamp6);
        stamps.add(stamp7);
        stamps.add(stamp8);

        boolean addedFirst = stamps.add(stamp1);
        boolean addedSecond = stamps.add(stamp2);

        System.out.println("Add first (duplicate) stamp " + addedFirst);  // true
        System.out.println("Add second (duplicate) stamp " + addedSecond); // false

        System.out.println("Collection Size: " + stamps.size());

        System.out.println("Contents of the stamp collection:");
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}

package com.kodilla;

import java.util.Scanner;

public class UserDialogs {

    public static void main(String[] args) {
        char firstLetter = askForFirstLetter();
        String color = getColorByFirstLetter(firstLetter);

        if (color != null) {
            System.out.println("User selected color: " + color);
        } else {
            System.out.println("Error. Color is unavailable.");
        }
    }

    public static char askForFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first letter of the color: ");
        return scanner.next().toLowerCase().charAt(0);
    }

    public static String getColorByFirstLetter(char letter) {
        switch (letter) {
            case 'r': return "Red";
            case 'l': return "Lagoon";
            case 'a': return "Amethystine";
            case 'gr': return "Gray";
            case 'c': return "Claret";
            case 'p': return "Pink";
            default: return null;
        }
    }
}

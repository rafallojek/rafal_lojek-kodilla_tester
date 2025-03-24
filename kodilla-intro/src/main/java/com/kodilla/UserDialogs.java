package com.kodilla;

import java.util.Scanner;

public class UserDialogs {

    public static void main(String[] args) {
        char firstLetter = askForFirstLetter();
        String color = getColorByFirstLetter(firstLetter);

        if (color != null) {
            System.out.println("User wybral kolor: " + color);
        } else {
            System.out.println("Blad. Nie ma takiego koloru.");
        }
    }

    public static char askForFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj, prosze pierwsza litere koloru: ");
        return scanner.next().toLowerCase().charAt(0);
    }

    public static String getColorByFirstLetter(char letter) {
        switch (letter) {
            case 'c': return "Czerwony";
            case 'l': return "Lagunowy";
            case 'z': return "Zielony";
            case 'a': return "Ametystowy";
            case 'p': return "Popielaty";
            case 'b': return "Bordowy";
            case 'r': return "Rozowy";
            case 't': return "Teczowy";
            case 'k': return "Kodillowy :) ";
            default: return null;
        }
    }
}

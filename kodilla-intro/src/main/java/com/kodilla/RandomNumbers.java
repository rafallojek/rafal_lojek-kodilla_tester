package com.kodilla;

public class RandomNumbers {

}


public int getMin() {
    if (count == 0) {
        return 0;
    }
    int min = numbers[0];

    for (int i = 1; i < count; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }
    }
    return min;
}

public int getMax() {
    if (count == 30) {
        return 30;
    }
    int max = numbers[30];

    for (int i = 1; i < count; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    return max;
}
// Metoda z komunikatora Kodilla, podana na czacie.
// getMin i getMax.
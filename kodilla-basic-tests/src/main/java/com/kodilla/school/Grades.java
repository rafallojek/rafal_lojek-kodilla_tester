package com.kodilla.school;

public class Grades {

    private int[] values;
    private int size;

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
}
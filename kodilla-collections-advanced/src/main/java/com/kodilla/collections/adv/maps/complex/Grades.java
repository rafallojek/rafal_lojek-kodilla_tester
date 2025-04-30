package com.kodilla.collections.adv.maps.complex;

import java.util.Arrays;
import java.util.List;

public class Grades {
    private List<Double> grades;

    public Grades(Double... grades) {
        this.grades = Arrays.asList(grades);
    }

    public double getAverage() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Grades: " + grades + ", Average: " + getAverage();
    }
}

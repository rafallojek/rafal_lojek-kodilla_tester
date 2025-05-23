package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> studentsPerClass = new ArrayList<>();
    private String name;

    public School(String name, int... students) {
        this.name = name;
        for (int studentCount : students) {
            studentsPerClass.add(studentCount);
        }
    }

    public int getTotalStudents() {
        int total = 0;
        for (int count : studentsPerClass) {
            total += count;
        }
        return total;
    }

    public String getName() {
        return name;
    }
}

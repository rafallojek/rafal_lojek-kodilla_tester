package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();

        schoolMap.put(new Principal("John Wayne"), new School("Western School", 20, 24, 26, 22));
        schoolMap.put(new Principal("Zac Efron"), new School("High School Musical", 30, 29, 31));
        schoolMap.put(new Principal("Maria Sklodowska-Curie"), new School("Sorbonne University", 21, 27, 16, 14, 216));

        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();
            System.out.println("Director: " + principal.getName());
            System.out.println("School: " + school.getName());
            System.out.println("Number of students: " + school.getTotalStudents());
            System.out.println("------------");
        }
    }
}

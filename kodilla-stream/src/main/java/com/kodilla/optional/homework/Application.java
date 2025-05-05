package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Walter White Junior", new Teacher("Walter White senior")));
        students.add(new Student("Jesse Pinkman", null));
        students.add(new Student("Saul Goodman ", new Teacher("Skyler White")));
        students.add(new Student("Marie Schrader", null));

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Student: " + student.getName() + ", Teacher: " + teacherName);
        }
    }
}

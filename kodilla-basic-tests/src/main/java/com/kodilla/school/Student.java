package com.kodilla.school;

public class Student {

    private String name;
    private Grades maths;
    private Grades physics;
    private Grades geography;
    private Grades history;

    public Student(String name) {
        this.name = name;
        this.maths = new Grades();
        this.physics = new Grades();
        this.geography = new Grades();
        this.history = new Grades();

    }

        public double getMathsAverage() {
            return this.maths.getAverage();
        }

        public double getPhysicsAverage() {
            return this.physics.getAverage();
        }

        public double getGeographyAverage() {
            return this.geography.getAverage();
        }

        public double getHistoryAverage() {
            return this.history.getAverage();
        }

    public double getAverage() {
        return -1;
    }
}

package com.kodilla.abstracts.homework;

abstract class Job {
    protected double salary;
    protected String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public double getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}

class Developer extends Job {
    public Developer() {
        super(9500, "Writing and debuging code, fixing bugs, collab with team.");
    }
}

class Teacher extends Job {
    public Teacher() {
        super(4200, "Teaching, preparing lesson plans, preparing exams, preparing meeting with parents.");
    }
}

class Doctor extends Job {
    public Doctor() {
        super(11400, "Diagnosing and treating patients, prescribing medication, conducting medical procedures.");
    }
}

class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsibilities() {
        System.out.println(firstName + "'s responsibilities: " + job.getResponsibilities());
    }

    public void getJob() {
    }
}
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
        super(8000, "Writing and maintaining code, fixing bugs, collaborating with team members.");
    }
}

class Teacher extends Job {
    public Teacher() {
        super(5000, "Teaching students, preparing lesson plans, grading assignments.");
    }
}

class Doctor extends Job {
    public Doctor() {
        super(12000, "Diagnosing and treating patients, prescribing medication, conducting medical procedures.");
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
}
package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    void testPerson() {
        Job job = new Job(1000, "coding") {};
        Person person = new Person("Jan", 30, job);
        person.getJob();
    }
}
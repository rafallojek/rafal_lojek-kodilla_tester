package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

class JobTest {
    @Test
    void testJob() {
        Job job = new Job(2000, "teaching") {};
        job.getSalary();
        job.getResponsibilities();
    }
}
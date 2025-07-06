package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        Year year = new Year(1600);
        assertTrue(year.isLeap());
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy100ButNotBy400() {
        Year year = new Year(1900);
        assertFalse(year.isLeap());
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4ButNotBy100() {
        Year year = new Year(2012);
        assertTrue(year.isLeap());
    }

    @Test
    public void shouldNotBeLeapYearIfNotDivisibleBy4() {
        Year year = new Year(2019);
        assertFalse(year.isLeap());
    }
}

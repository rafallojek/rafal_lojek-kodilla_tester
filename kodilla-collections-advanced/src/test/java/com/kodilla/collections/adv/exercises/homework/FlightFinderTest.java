package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTest {

    private final FlightFinder finder = new FlightFinder();

    @Test
    public void testFindFlightsFromLublin() {
        // given
        String departure = "Lublin";

        // when
        List<Flight> results = finder.findFlightsFrom(departure);

        // then
        assertEquals(3, results.size());
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Warsaw")));
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Paris")));
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Toronto")));
    }

    @Test
    public void testFindFlightsToLublin() {
        // given
        String arrival = "Lublin";

        // when
        List<Flight> results = finder.findFlightsTo(arrival);

        // then
        assertEquals(3, results.size());
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Warsaw")));
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Montreal")));
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Toronto")));
    }

    @Test
    public void testFindFlightsToWarsaw() {
        // given
        String arrival = "Warsaw";

        // when
        List<Flight> results = finder.findFlightsTo(arrival);

        // then
        assertEquals(3, results.size());
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Lublin")));
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Toronto")));
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Hamburg")));
    }
}

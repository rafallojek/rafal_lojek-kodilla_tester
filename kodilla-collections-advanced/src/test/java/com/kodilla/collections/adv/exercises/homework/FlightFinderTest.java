package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTest {

    private final FlightFinder finder = new FlightFinder();

    @Test
    public void testFindFlightsFrom_Lublin() {
        List<Flight> results = finder.findFlightsFrom("Lublin");
        assertEquals(3, results.size());
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Warsaw")));
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Paris")));
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Toronto")));
    }

    @Test
    public void testFindFlightsTo_Lublin() {
        List<Flight> results = finder.findFlightsTo("Lublin");
        assertEquals(3, results.size());
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Warsaw")));
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Montreal")));
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Toronto")));
    }

    @Test
    public void testFindFlightsFrom_Warsaw() {
        List<Flight> results = finder.findFlightsFrom("Warsaw");
        assertEquals(3, results.size());
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Lublin")));
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Montreal")));
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Hamburg")));
    }

    @Test
    public void testFindFlightsTo_Warsaw() {
        List<Flight> results = finder.findFlightsTo("Warsaw");
        assertEquals(3, results.size());
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Lublin")));
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Paris")));
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Toronto")));
    }

    @Test
    public void testFindFlightsFrom_Hamburg() {
        List<Flight> results = finder.findFlightsFrom("Hamburg");
        assertEquals(3, results.size());
        assertTrue(results.stream().allMatch(f -> isKnownCity(f.getArrival())));
    }

    @Test
    public void testFindFlightsTo_Hamburg() {
        List<Flight> results = finder.findFlightsTo("Hamburg");
        assertEquals(3, results.size());
        assertTrue(results.stream().allMatch(f -> isKnownCity(f.getDeparture())));
    }

    @Test
    public void testFindFlightsFrom_Montreal() {
        List<Flight> results = finder.findFlightsFrom("Montreal");
        assertEquals(3, results.size());
    }

    @Test
    public void testFindFlightsTo_Montreal() {
        List<Flight> results = finder.findFlightsTo("Montreal");
        assertEquals(2, results.size());
    }

    @Test
    public void testFindFlightsFrom_Toronto() {
        List<Flight> results = finder.findFlightsFrom("Toronto");
        assertEquals(3, results.size());
    }

    @Test
    public void testFindFlightsTo_Toronto() {
        List<Flight> results = finder.findFlightsTo("Toronto");
        assertEquals(3, results.size());
    }

    @Test
    public void testFindFlightsFrom_Paris() {
        List<Flight> results = finder.findFlightsFrom("Paris");
        assertEquals(3, results.size());
    }

    @Test
    public void testFindFlightsTo_Paris() {
        List<Flight> results = finder.findFlightsTo("Paris");
        assertEquals(3, results.size());
    }

    private boolean isKnownCity(String city) {
        return List.of("Lublin", "Warsaw", "Hamburg", "Montreal", "Toronto", "Paris").contains(city);
    }
}

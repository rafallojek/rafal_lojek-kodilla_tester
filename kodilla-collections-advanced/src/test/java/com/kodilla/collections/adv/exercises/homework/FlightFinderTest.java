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
    public void testFindFlightsFromWarsaw() {
        // given
        String departure = "Warsaw";

        // when
        List<Flight> results = finder.findFlightsFrom(departure);

        // then
        assertEquals(3, results.size());
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Lublin")));
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Montreal")));
        assertTrue(results.stream().anyMatch(f -> f.getArrival().equals("Hamburg")));
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
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Paris")));
        assertTrue(results.stream().anyMatch(f -> f.getDeparture().equals("Toronto")));
    }

    @Test
    public void testFindFlightsFromHamburg() {
        // given
        String departure = "Hamburg";

        // when
        List<Flight> results = finder.findFlightsFrom(departure);

        // then
        assertEquals(3, results.size());
        assertTrue(results.stream().allMatch(f -> isKnownCity(f.getArrival())));
    }

    @Test
    public void testFindFlightsToHamburg() {
        // given
        String arrival = "Hamburg";

        // when
        List<Flight> results = finder.findFlightsTo(arrival);

        // then
        assertEquals(3, results.size());
        assertTrue(results.stream().allMatch(f -> isKnownCity(f.getDeparture())));
    }

    @Test
    public void testFindFlightsFromMontreal() {
        // given
        String departure = "Montreal";

        // when
        List<Flight> results = finder.findFlightsFrom(departure);

        // then
        assertEquals(3, results.size());
    }

    @Test
    public void testFindFlightsToMontreal() {
        // given
        String arrival = "Montreal";

        // when
        List<Flight> results = finder.findFlightsTo(arrival);

        // then
        assertEquals(2, results.size());
    }

    @Test
    public void testFindFlightsFromToronto() {
        // given
        String departure = "Toronto";

        // when
        List<Flight> results = finder.findFlightsFrom(departure);

        // then
        assertEquals(3, results.size());
    }

    @Test
    public void testFindFlightsToToronto() {
        // given
        String arrival = "Toronto";

        // when
        List<Flight> results = finder.findFlightsTo(arrival);

        // then
        assertEquals(3, results.size());
    }

    @Test
    public void testFindFlightsFromParis() {
        // given
        String departure = "Paris";

        // when
        List<Flight> results = finder.findFlightsFrom(departure);

        // then
        assertEquals(3, results.size());
    }

    @Test
    public void testFindFlightsToParis() {
        // given
        String arrival = "Paris";

        // when
        List<Flight> results = finder.findFlightsTo(arrival);

        // then
        assertEquals(3, results.size());
    }

    private boolean isKnownCity(String city) {
        return List.of("Lublin", "Warsaw", "Hamburg", "Montreal", "Toronto", "Paris").contains(city);
    }
}

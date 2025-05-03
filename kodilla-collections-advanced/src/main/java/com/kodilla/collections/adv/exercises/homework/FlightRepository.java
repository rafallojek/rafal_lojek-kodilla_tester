package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Lublin", "Warsaw"));
        flights.add(new Flight("Lublin", "Paris"));
        flights.add(new Flight("Lublin", "Toronto"));

        flights.add(new Flight("Warsaw", "Lublin"));
        flights.add(new Flight("Warsaw", "Montreal"));
        flights.add(new Flight("Warsaw", "Hamburg"));

        flights.add(new Flight("Hamburg", "Paris"));
        flights.add(new Flight("Hamburg", "Toronto"));
        flights.add(new Flight("Hamburg", "Warsaw"));

        flights.add(new Flight("Montreal", "Lublin"));
        flights.add(new Flight("Montreal", "Hamburg"));
        flights.add(new Flight("Montreal", "Paris"));

        flights.add(new Flight("Toronto", "Warsaw"));
        flights.add(new Flight("Toronto", "Montreal"));
        flights.add(new Flight("Toronto", "Lublin"));

        flights.add(new Flight("Paris", "Hamburg"));
        flights.add(new Flight("Paris", "Toronto"));
        flights.add(new Flight("Paris", "Warsaw"));

        return flights;
    }
}

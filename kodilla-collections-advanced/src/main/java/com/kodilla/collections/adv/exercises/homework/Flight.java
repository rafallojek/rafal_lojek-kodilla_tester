package com.kodilla.collections.adv.exercises.homework;

public class Flight {
    private final String departure;
    private final String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
}

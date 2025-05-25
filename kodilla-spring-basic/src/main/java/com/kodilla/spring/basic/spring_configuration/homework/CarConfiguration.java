package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class CarConfiguration {

    @Bean
    public Car car() {
        String season = getCurrentSeason();
        boolean headlightsOn = isHeadlightsTime();

        return switch (season) {
            case "summer" -> new Cabrio(headlightsOn);
            case "winter" -> new SUV(headlightsOn);
            default -> new Sedan(headlightsOn);
        };
    }

    private String getCurrentSeason() {
        return "summer";
    }

    private boolean isHeadlightsTime() {
        LocalTime now = LocalTime.now();
        return now.isAfter(LocalTime.of(19, 59)) || now.isBefore(LocalTime.of(6, 1));
    }
}

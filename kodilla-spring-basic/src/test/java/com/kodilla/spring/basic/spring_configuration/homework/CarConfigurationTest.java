package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class CarConfigurationTest {

    @Test
    public void shouldReturnCabrioForSummer() {
        // Given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CarConfiguration.class);

        // When
        Car car = context.getBean(Car.class);

        // Then
        assertEquals("Cabrio", car.getCarType());
    }

    @Test
    public void shouldHaveHeadlightsOnAtNight() {
        // Given
        LocalTime nightTime = LocalTime.of(21, 0);
        boolean isHeadlightsOn = nightTime.isAfter(LocalTime.of(19, 59)) || nightTime.isBefore(LocalTime.of(6, 1));

        // When
        Car car = new SUV(isHeadlightsOn);

        // Then
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldHaveHeadlightsOffDuringDay() {
        // Given
        LocalTime dayTime = LocalTime.of(12, 0);
        boolean isHeadlightsOn = dayTime.isAfter(LocalTime.of(19, 59)) || dayTime.isBefore(LocalTime.of(6, 1));

        // When
        Car car = new Sedan(isHeadlightsOn);

        // Then
        assertFalse(car.hasHeadlightsTurnedOn());
    }
}

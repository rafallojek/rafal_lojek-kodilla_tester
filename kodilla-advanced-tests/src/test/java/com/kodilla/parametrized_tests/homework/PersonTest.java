package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.homework.PersonTestData#provideBMIData")
    void shouldReturnCorrectBMICategory(double heightInMeters, double weightInKilogram, String expectedCategory) {
        // given
        Person person = new Person(heightInMeters, weightInKilogram);

        // when
        String actualCategory = person.getBMI();

        // then
        assertEquals(expectedCategory, actualCategory);
    }
}

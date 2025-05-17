package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.Set;

class GamblingMachineTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 1)
    void testHowManyWins(String numbersString, int expectedCount) throws InvalidNumbersException {
        GamblingMachine machine = new GamblingMachine();
        Set<Integer> userNumbers = new HashSet<>();
        String[] numbersArray = numbersString.split(";");
        for (String number : numbersArray) {
            userNumbers.add(Integer.parseInt(number));
        }
        int result = machine.howManyWins(userNumbers);
        Assertions.assertEquals(expectedCount, result);
    }
}

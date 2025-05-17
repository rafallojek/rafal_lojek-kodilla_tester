package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTestData {

    public static Stream<Arguments> provideBMIData() {
        return Stream.of(
                Arguments.of(1.80, 40, "Very severely underweight"),    // bmi = 12.345
                Arguments.of(1.70, 45, "Severely underweight"),         // bmi = 15.57
                Arguments.of(1.75, 55, "Underweight"),                   // bmi = 17.96
                Arguments.of(1.60, 60, "Normal (healthy weight)"),       // bmi = 23.44
                Arguments.of(1.65, 75, "Overweight"),                    // bmi = 27.55
                Arguments.of(1.70, 90, "Obese Class I (Moderately obese)"), // bmi = 31.14
                Arguments.of(1.75, 120, "Obese Class II (Severely obese)"), // bmi = 39.18
                Arguments.of(1.80, 140, "Obese Class III (Very severely obese)"), // bmi = 43.21
                Arguments.of(1.60, 130, "Obese Class IV (Morbidly Obese)"), // bmi = 50.78
                Arguments.of(1.70, 170, "Obese Class V (Super Obese)"),    // bmi = 58.82
                Arguments.of(1.75, 200, "Obese Class VI (Hyper Obese)")   // bmi = 65.30
        );
    }
}

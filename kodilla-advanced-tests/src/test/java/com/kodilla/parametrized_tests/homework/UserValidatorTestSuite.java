package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private final UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource({
            "user123, true",
            "a_b, true",
            "A-B, true",
            "ab, false",
            "user!name, false",
            "user name, false",
            "'', false",
            "null, false"
    })
    void shouldValidateUsernameCorrectly(String username, boolean expected) {
        // Given
        String inputUsername = "null".equals(username) ? null : username;

        // When
        boolean result = validator.validateUsername(inputUsername);

        // Then
        assertEquals(expected, result, () -> "Username validation failed for input: " + inputUsername);
    }

    @ParameterizedTest
    @CsvSource({
            "user@example.com, true",
            "user.name@example.co, true",
            "user_name@example.com, true",
            "user-name@example.com, true",
            "user@sub.example.com, true",
            "user@ex-ample.com, true",
            "user@.com, false",
            "user@com, false",
            "userexample.com, false",
            "user@exam_ple.com, false",
            "user@exam!ple.com, false",
            "'', false",
            "null, false"
    })
    void shouldValidateEmailCorrectly(String email, boolean expected) {
        // Given
        String inputEmail = "null".equals(email) ? null : email;

        // When
        boolean result = validator.validateEmail(inputEmail);

        // Then
        assertEquals(expected, result, () -> "Email validation failed for input: " + inputEmail);
    }
}

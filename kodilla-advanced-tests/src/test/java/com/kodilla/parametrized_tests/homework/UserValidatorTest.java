package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private final UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource({
            "user,true",
            "us,false",
            "user_123,true",
            "user.name,true",
            "user-name,true",
            "us,false",
            "'',false",
            "null,false"
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
            "test@gmail.com,true",
            "user.name@gmail.co,true",
            "user@sub.gmail.com,true",
            "user@gmail,false",
            "user@.com,false",
            "user@gmail.c,false",
            "'',false",
            "null,false"
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

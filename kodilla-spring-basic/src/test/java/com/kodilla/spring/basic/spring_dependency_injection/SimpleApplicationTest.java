package com.kodilla.spring.basic.spring_dependency_injection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SimpleApplicationTest {

    @Autowired
    private SkypeMessageService skypeMessageService;

    @Autowired
    private SimpleApplication simpleApplication;

    @Test
    void shouldReturnCorrectMessage() {
        // When
        String result = skypeMessageService.send("Test", "Any receiver");

        // Then
        assertNotNull(result);
        assertEquals("Sending [Test] to: Any receiver using Skype", result);
    }

    @Test
    void shouldProcessMessage() {
        // When
        String result = simpleApplication.processMessage("Test", "Any receiver");

        // Then
        assertEquals("Sending [Test] to: Any receiver using Skype", result);
    }
}

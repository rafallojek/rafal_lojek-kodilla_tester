package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @Test
    void shouldReturnDifferentTimeForDifferentPrototypeBeans() {
        // given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");

        // when
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);

        // then
        System.out.println("Clock1 time: " + clock1.getTime());
        System.out.println("Clock2 time: " + clock2.getTime());

        assertNotEquals(clock1.getTime(), clock2.getTime());

        context.close();
    }
}

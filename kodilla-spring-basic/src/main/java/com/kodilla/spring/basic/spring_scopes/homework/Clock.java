package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Scope("prototype")
public class Clock {

    private final Instant time;

    public Clock() {
        this.time = Instant.now();
    }

    public Instant getTime() {
        return time;
    }
}

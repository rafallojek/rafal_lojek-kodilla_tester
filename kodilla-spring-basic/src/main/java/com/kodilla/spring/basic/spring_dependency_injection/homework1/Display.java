package com.kodilla.spring.basic.spring_dependency_injection.homework1;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void display(double value) {
        System.out.println("Result on display: " + value);
    }
}

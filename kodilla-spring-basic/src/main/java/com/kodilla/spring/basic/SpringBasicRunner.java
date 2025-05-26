package com.kodilla.spring.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan; // Import this if needed

@SpringBootApplication
@ComponentScan({"com.kodilla.spring.basic.spring_scopes", "com.kodilla.spring.basic.spring_dependency_injection"})
public class SpringBasicRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBasicRunner.class, args);
    }
}
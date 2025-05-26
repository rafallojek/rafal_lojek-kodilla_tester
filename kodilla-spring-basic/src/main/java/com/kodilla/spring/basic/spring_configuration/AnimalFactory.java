package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnimalFactory {

    @Bean
    @Primary
    public Dog createDog() {
        return new Dog();
    }

    @Bean
    public Cat createCat() {
        return new Cat();
    }
}
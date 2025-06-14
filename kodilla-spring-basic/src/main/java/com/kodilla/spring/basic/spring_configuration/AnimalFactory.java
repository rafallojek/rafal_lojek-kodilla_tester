package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Random;

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

    @Bean
    public Duck createDuck() {
        return new Duck();
    }

    @Bean
    public Animal randomAnimal() {
        int pick = new Random().nextInt(3);
        switch (pick) {
            case 0: return new Dog();
            case 1: return new Cat();
            default: return new Duck();
        }
    }
}

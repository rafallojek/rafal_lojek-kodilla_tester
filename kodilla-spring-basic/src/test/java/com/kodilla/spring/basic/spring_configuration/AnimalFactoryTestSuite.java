package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class AnimalFactoryTestSuite {

    @Test
    public void testDogCreated() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(AnimalFactory.class);
        Dog dog = (Dog) context.getBean("createDog");
        //When
        String voice = dog.getVoice();
        //Then
        Assertions.assertEquals("Bark bark", voice);
    }

    @Test
    public void shouldCreateDogBeanAndFetchByBeanName() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(AnimalFactory.class);
        Dog dog = (Dog) context.getBean("createDog");
        //When
        String voice = dog.getVoice();
        //Then
        Assertions.assertEquals("Bark bark", voice);
    }

    @Test
    public void shouldCreateRandomAnimal() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(AnimalFactory.class);
        Animal animal = (Animal) context.getBean("randomAnimal");
        //When
        String voice = animal.getVoice();
        System.out.println(voice);
        //Then
        List<String> possibleVoices = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        Assertions.assertTrue(possibleVoices.contains(voice));
    }
}

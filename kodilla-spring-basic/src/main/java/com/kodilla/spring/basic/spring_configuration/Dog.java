package com.kodilla.spring.basic.spring_configuration; !

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public abstract class Dog implements Animal {
    // ...
}
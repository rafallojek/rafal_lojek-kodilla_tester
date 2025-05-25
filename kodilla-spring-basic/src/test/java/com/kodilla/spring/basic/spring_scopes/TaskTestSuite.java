package com.kodilla.spring.basic.spring_scopes;

import com.kodilla.spring.basic.SpringBasicRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = SpringBasicRunner.class)
public class TaskTestSuite {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldCreateDifferentTasks() {
        Task firstBean = context.getBean(Task.class);
        Task secondBean = context.getBean(Task.class);
        Task thirdBean = context.getBean(Task.class);

        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
    }
}

package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleApplication {
    private final MessageService messageService;

    @Autowired
    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public String processMessage(String message, String receiver) {
        return this.messageService.send(message, receiver);
    }
}

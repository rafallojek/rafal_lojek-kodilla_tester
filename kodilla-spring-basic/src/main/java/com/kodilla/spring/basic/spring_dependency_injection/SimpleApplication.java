package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.stereotype.Component; // Import this

@Component
public class SimpleApplication {

    private MessageService messageService;

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public String processMessage(String message, String receiver) {
        return this.messageService.sendMessage(message, receiver);
    }
}
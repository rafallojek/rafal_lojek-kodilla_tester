package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public String sendMessage(String message, String receiver) {
        return "Sending message: " + message + " to: " + receiver;
    }
}
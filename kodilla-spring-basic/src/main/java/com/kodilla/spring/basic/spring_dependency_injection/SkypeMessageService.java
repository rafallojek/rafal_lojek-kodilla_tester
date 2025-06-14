package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.stereotype.Service;

@Service
public class SkypeMessageService implements MessageService {
    @Override
    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Skype";
    }
}

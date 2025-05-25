package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.dependency_injection.MessageService;
import org.springframework.stereotype.Service;

@Service
public class EmailMessageService implements MessageService {

    @Override
    public String send(String message, String receiver) {
        return "Sending email to " + receiver + " with message: " + message;
    }
}

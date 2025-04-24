package com.example.GreetingsApp.service;

import com.example.GreetingsApp.model.Greeting;
import com.example.GreetingsApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class GreetingService {
//    public String getGreetingMessage() {
//        return "Hello World";
//    }
//}


@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }


    public void deleteGreeting(Long id) {
        if (!greetingRepository.existsById(id)) {
            throw new RuntimeException("Greeting not found with ID: " + id);
        }
        greetingRepository.deleteById(id);
    }



    public String getGreetingMessage(String firstName, String lastName) {
        String message;

        if (firstName != null && lastName != null) {
            message = "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            message = "Hello " + firstName;
        } else if (lastName != null) {
            message = "Hello " + lastName;
        } else {
            message = "Hello World";
        }

        Greeting greeting = new Greeting(message);
        greetingRepository.save(greeting);

        return message;
    }

}
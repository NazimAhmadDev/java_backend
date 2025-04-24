package com.example.GreetingsApp.controller;


import com.example.GreetingsApp.GreetingsAppApplication;
import com.example.GreetingsApp.model.Greeting;
import com.example.GreetingsApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public Greeting getGreeting (
        @RequestParam(required = false) String firstName,
        @RequestParam(required = false) String lastName
    ) {
        String message = greetingService.getGreetingMessage(firstName, lastName);
        return new Greeting(message);
    }

//    @GetMapping
//    public Greeting getGreeting() {
//        String message = greetingService.getGreetingMessage();
//        return new Greeting(message);
//    }



//    @GetMapping
//    public Greeting getGreeting() {
//        return new Greeting("Hello from GET!");
//    }

    @PostMapping
    public Greeting postGreeting() {
        return new Greeting("Hello from POST!");
    }

    @PutMapping
    public Greeting putGreeting() {
        return new Greeting("Hello from PUT!");
    }

    @DeleteMapping
    public Greeting deleteGreeting() {
        return new Greeting("Hello from DELETE!");
    }

    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @DeleteMapping("/{id}")
    public String deleteGreeting(@PathVariable Long id) {
        greetingService.deleteGreeting(id);
        return "Greeting with ID " + id + " has been deleted.";
    }
}

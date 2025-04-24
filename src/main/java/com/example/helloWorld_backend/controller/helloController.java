package com.example.helloWorld_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/h")
    public String hello() {
        return "Hello World";
    }
}

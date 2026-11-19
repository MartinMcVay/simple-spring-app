package com.example.simplespringapp.web;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public Greeting index() {
        return greet("World");
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(name = "name", defaultValue = "World") String name) {
        return greet(name);
    }

    private Greeting greet(String name) {
        return new Greeting("Hello, " + name + "!", Instant.now().toString());
    }

    public record Greeting(String message, String timestamp) {
    }
}

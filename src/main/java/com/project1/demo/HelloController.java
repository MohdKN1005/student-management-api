package com.project1.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Second message"; // your choice of message
    }

    @GetMapping("/user/{username}")
    public String getUser(@PathVariable String username) {
        return "Welcome, " + username;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return "Multiply: " + (a * b);
    }

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        return "Created user: " + user.getName() + ", Age: " + user.getAge();
    }
}
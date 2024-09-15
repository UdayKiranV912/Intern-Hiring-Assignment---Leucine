package com.example.collegedirectory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Authentication logic
        return "Logged in successfully";
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        // Registration logic
        return "Registered successfully";
    }
}

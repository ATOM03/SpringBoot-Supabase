package com.example.demo.controller;

import com.example.demo.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwt;

    public AuthController(JwtUtil jwt) {
        this.jwt = jwt;
    }

    // Beginner demo: accept username/password and always issue a token.
    // TODO: Replace with real user lookup and password verification (BCrypt).
    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String username, @RequestParam String password) {
        // Pretend the credentials are valid
        if(username.equals("test") && password.equals("password")) {
            String token = jwt.generateToken(username, Map.of("role", "USER"));
            return Map.of("access_token", token, "token_type", "Bearer");
        }
        return Map.of("error","401","message", "Invalid Username or Password");
    }
}
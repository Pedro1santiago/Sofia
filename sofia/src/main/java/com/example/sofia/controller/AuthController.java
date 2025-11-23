package com.example.sofia.controller;

import com.example.sofia.models.Users.LoginRequest;
import com.example.sofia.models.Users.Role;
import com.example.sofia.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        boolean ok = authService.login(request);
        if (ok) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(
            @RequestParam String userName,
            @RequestParam String password,
            @RequestParam(defaultValue = "USER") String role
    ) {
        try {
            Role userRole = Role.valueOf(role.toUpperCase());
            authService.register(userName, password, userRole);
            return ResponseEntity.ok("User registered successfully");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid role. Use USER or ADMIN");
        }
    }
}

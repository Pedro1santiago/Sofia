package com.example.sofia.controller;

import com.example.sofia.models.Users.Localizacao;
import com.example.sofia.models.Users.LoginRequest;
import com.example.sofia.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Auth controller is working!");
    }

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
            @RequestParam String localizacao,
            @RequestParam(required = false) String estado,
            @RequestParam(required = false) String cidade,
            @RequestParam(required = false) String bairro
    ) {
        try {
            Localizacao loc = Localizacao.valueOf(localizacao.toUpperCase());
            authService.register(userName, password, loc, estado, cidade, bairro);
            return ResponseEntity.ok("User registered successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Registration failed: " + e.getMessage());
        }
    }
}

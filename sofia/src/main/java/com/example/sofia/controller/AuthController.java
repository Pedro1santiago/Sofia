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
            @RequestParam Localizacao localizacao,
            @RequestParam(required = false) String estado,
            @RequestParam(required = false) String cidade,
            @RequestParam(required = false) String bairro
    ) {
        authService.register(userName, password, localizacao, estado, cidade, bairro);
        return ResponseEntity.ok("Admin registered successfully");
    }
}

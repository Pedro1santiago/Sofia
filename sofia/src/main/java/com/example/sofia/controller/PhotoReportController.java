package com.example.sofia.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/photo-report")
public class PhotoReportController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadPhoto(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Arquivo não pode estar vazio");
        }
        return ResponseEntity.ok("Foto enviada com sucesso: " + file.getOriginalFilename());
    }
}
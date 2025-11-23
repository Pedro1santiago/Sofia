package com.example.sofia.controller;

import com.example.sofia.models.UserInteraction.UserInteraction;
import com.example.sofia.models.UserInteraction.UserInteractionDTO;
import com.example.sofia.service.UserInteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-interaction")
public class UserInteractionController {

    @Autowired
    private UserInteractionService userInteractionService;

    @PostMapping
    public UserInteraction createInteraction(@RequestBody UserInteractionDTO dto) {
        return userInteractionService.saveInteraction(dto);
    }

    @GetMapping
    public List<UserInteraction> getAll() {
        return userInteractionService.getAll();
    }

    @GetMapping("/{id}")
    public UserInteraction getById(@PathVariable Long id) {
        return userInteractionService.getInteractionById(id);
    }
}

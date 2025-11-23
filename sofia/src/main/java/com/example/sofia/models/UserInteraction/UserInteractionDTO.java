package com.example.sofia.models.UserInteraction;

import java.time.LocalDateTime;

public record UserInteractionDTO(Long id, String name, Integer age, LocalDateTime interactionDate) { }

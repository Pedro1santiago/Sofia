package com.example.sofia.models.UserInteraction;

import com.example.sofia.models.Users.Localizacao;
import java.time.LocalDateTime;

public record UserInteractionDTO(
        Long id,
        String name,
        Integer age,
        LocalDateTime interactionDate,
        Localizacao localizacao,
        String estado,
        String cidade,
        String bairro
) { }

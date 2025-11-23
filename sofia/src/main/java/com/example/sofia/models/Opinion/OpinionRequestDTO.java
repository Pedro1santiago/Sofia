package com.example.sofia.models.Opinion;

import com.example.sofia.models.Users.Localizacao;

public record OpinionRequestDTO(
        Long userId,
        String opinionText,
        Localizacao localizacao,
        String estado,
        String cidade,
        String bairro,
        Integer relevancia
) {}


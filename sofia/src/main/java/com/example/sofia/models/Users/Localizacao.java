package com.example.sofia.models.Users;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Localizacao {
    NACIONAL,
    ESTADO,
    CIDADE,
    BAIRRO;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static Localizacao fromJson(String value) {
        return Localizacao.valueOf(value.toUpperCase());
    }

    @JsonValue
    public String toJson() {
        return this.name();
    }
}




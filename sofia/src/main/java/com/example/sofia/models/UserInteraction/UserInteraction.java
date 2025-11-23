package com.example.sofia.models.UserInteraction;

import com.example.sofia.models.Users.Localizacao;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_interaction")
public class UserInteraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String whatsappNumber;
    private Integer age;
    private LocalDateTime interactionDate;

    @Enumerated(EnumType.STRING)
    private Localizacao localizacao;

    private String estado;
    private String cidade;
    private String bairro;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getInteractionDate() {
        return interactionDate;
    }

    public void setInteractionDate(LocalDateTime interactionDate) {
        this.interactionDate = interactionDate;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}

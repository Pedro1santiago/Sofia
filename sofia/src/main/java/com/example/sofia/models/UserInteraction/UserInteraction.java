package com.example.sofia.models.UserInteraction;

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

    public Integer getAge(Integer age) {
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
}

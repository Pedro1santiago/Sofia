package com.example.sofia.models.Opinion;

import com.example.sofia.models.UserInteraction.UserInteraction;
import com.example.sofia.models.context.Context;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "opinion")
public class Opinion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserInteraction user;

    @ManyToOne
    @JoinColumn(name = "context_id")
    private Context context;

    private String opinionText;
    private LocalDateTime createdAt;

    private Integer relevancia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserInteraction getUser() {
        return user;
    }

    public void setUser(UserInteraction user) {
        this.user = user;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getOpinionText() {
        return opinionText;
    }

    public void setOpinionText(String opinionText) {
        this.opinionText = opinionText;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getRelevancia() {
        return relevancia;
    }

    public void setRelevancia(Integer relevancia) {
        this.relevancia = relevancia;
    }
}

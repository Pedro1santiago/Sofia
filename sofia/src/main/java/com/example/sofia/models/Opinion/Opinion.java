package com.example.sofia.models.Opinion;

import com.example.sofia.models.UserInteraction.UserInteraction;
import com.example.sofia.models.Users.Localizacao;
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

    @Enumerated(EnumType.STRING)
    private Localizacao localizacao;

    private String estado;
    private String cidade;
    private String bairro;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserInteraction getUser() { return user; }
    public void setUser(UserInteraction user) { this.user = user; }

    public Context getContext() { return context; }
    public void setContext(Context context) { this.context = context; }

    public String getOpinionText() { return opinionText; }
    public void setOpinionText(String opinionText) { this.opinionText = opinionText; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public Integer getRelevancia() { return relevancia; }
    public void setRelevancia(Integer relevancia) { this.relevancia = relevancia; }

    public Localizacao getLocalizacao() { return localizacao; }
    public void setLocalizacao(Localizacao localizacao) { this.localizacao = localizacao; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }
}

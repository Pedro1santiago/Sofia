package com.example.sofia.models.Users;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    private Localizacao localizacao;

    private String estado;
    private String cidade;
    private String bairro;

    public User() {}

    public User(String userName, String passwordHash) {
        this.userName = userName;
        this.passwordHash = passwordHash;

        this.localizacao = null;
        this.estado = null;
        this.cidade = null;
        this.bairro = null;
    }

    public User(String userName, String passwordHash, Localizacao localizacao, String estado, String cidade, String bairro) {
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.localizacao = localizacao;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public Localizacao getLocalizacao() { return localizacao; }
    public void setLocalizacao(Localizacao localizacao) { this.localizacao = localizacao; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }
}

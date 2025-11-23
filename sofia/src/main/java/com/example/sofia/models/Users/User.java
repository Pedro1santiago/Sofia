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
    private Role role = Role.USER;

    public User() {}

    public User(String userName, String passwordHash, Role role) {
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.role = role;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}

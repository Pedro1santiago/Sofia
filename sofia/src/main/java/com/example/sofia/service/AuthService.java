package com.example.sofia.service;

import com.example.sofia.models.Users.Localizacao;
import com.example.sofia.models.Users.LoginRequest;
import com.example.sofia.models.Users.User;
import com.example.sofia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepo;

    public boolean login(LoginRequest request) {
        return userRepo.findByUserName(request.userName())
                .map(user -> user.getPasswordHash().equals(request.password()))
                .orElse(false);
    }

    public User register(String userName, String password, Localizacao localizacao,
                         String estado, String cidade, String bairro) {
        User user = new User(userName, password, localizacao, estado, cidade, bairro);
        return userRepo.save(user);
    }
}

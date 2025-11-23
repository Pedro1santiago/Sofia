package com.example.sofia.service;

import com.example.sofia.models.UserInteraction.UserInteraction;
import com.example.sofia.models.UserInteraction.UserInteractionDTO;
import com.example.sofia.repository.UserInteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInteractionService {

    @Autowired
    UserInteractionRepository userInteractionRepository;

    public UserInteraction saveInteraction(UserInteractionDTO dto){

        UserInteraction userInteraction = new UserInteraction();
        userInteraction.setName(dto.name());
        userInteraction.setAge(dto.age());
        userInteraction.setInteractionDate(dto.interactionDate());

        return userInteractionRepository.save(userInteraction);
    }

    public List<UserInteraction> getAll(){
        return userInteractionRepository.findAll();
    }

    public UserInteraction getInteractionById(Long id){
        return userInteractionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}

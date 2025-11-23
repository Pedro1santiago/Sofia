package com.example.sofia.service;

import com.example.sofia.models.Opinion.Opinion;
import com.example.sofia.models.Opinion.OpinionRequestDTO;
import com.example.sofia.models.UserInteraction.UserInteraction;
import com.example.sofia.repository.OpinionRepository;
import com.example.sofia.repository.UserInteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OpinionService {

    @Autowired
    private OpinionRepository opinionRepository;

    @Autowired
    private UserInteractionRepository userInteractionRepository;

    public Opinion createOpinion(OpinionRequestDTO dto) {
        UserInteraction user = userInteractionRepository.findById(dto.userId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Opinion opinion = new Opinion();
        opinion.setUser(user);
        opinion.setOpinionText(dto.text());
        opinion.setCreatedAt(LocalDateTime.now());

        return opinionRepository.save(opinion);
    }

    public List<Opinion> getAll() {
        return opinionRepository.findAll();
    }

    public List<Opinion> getByUser(Long userId) {
        return opinionRepository.findByUserId(userId);
    }
}

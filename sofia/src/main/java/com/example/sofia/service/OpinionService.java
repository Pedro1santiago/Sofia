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
        opinion.setOpinionText(dto.opinionText());
        opinion.setCreatedAt(LocalDateTime.now());
        opinion.setRelevancia(dto.relevancia() != null ? dto.relevancia() : 0);

        opinion.setLocalizacao(dto.localizacao());
        opinion.setEstado(dto.estado());
        opinion.setCidade(dto.cidade());
        opinion.setBairro(dto.bairro());

        return opinionRepository.save(opinion);
    }

    public List<Opinion> getAll() {
        return opinionRepository.findAll();
    }

    public List<Opinion> getByUser(Long userId) {
        return opinionRepository.findByUserId(userId);
    }

    public List<Opinion> getByFilters(String estado, String cidade, String bairro, Integer minRelevancia, Long contextId) {
        return opinionRepository.findByFilters(
                estado,
                cidade,
                bairro,
                minRelevancia != null ? minRelevancia : 0,
                contextId
        );
    }
}


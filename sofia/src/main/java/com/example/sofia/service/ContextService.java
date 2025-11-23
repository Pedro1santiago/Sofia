package com.example.sofia.service;

import com.example.sofia.models.context.Context;
import com.example.sofia.repository.ContextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContextService {

    @Autowired
    private ContextRepository contextRepository;

    public List<Context> getAllContexts() {
        return contextRepository.findAll();
    }

    public Context getContextById(Long id) {
        return contextRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Context not found"));
    }

    public List<Context> searchContexts(String text) {
        return contextRepository.searchByText(text);
    }
}

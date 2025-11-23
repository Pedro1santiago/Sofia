package com.example.sofia.controller;

import com.example.sofia.models.context.Context;
import com.example.sofia.service.ContextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/context")
public class ContextController {

    @Autowired
    private ContextService contextService;

    @GetMapping
    public List<Context> getAllContexts(@RequestParam(required = false) String search) {
        if (search != null && !search.isBlank()) {
            return contextService.searchContexts(search);
        }
        return contextService.getAllContexts();
    }

    @GetMapping("/{id}")
    public Context getContextById(@PathVariable Long id) {
        return contextService.getContextById(id);
    }
}

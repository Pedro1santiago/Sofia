package com.example.sofia.controller;

import com.example.sofia.models.Opinion.Opinion;
import com.example.sofia.models.Opinion.OpinionRequestDTO;
import com.example.sofia.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/opinion")
public class OpinionController {

    @Autowired
    private OpinionService opinionService;

    @PostMapping
    public Opinion createOpinion(@RequestBody OpinionRequestDTO dto) {
        return opinionService.createOpinion(dto);
    }

    @GetMapping
    public List<Opinion> getAll(){
        return opinionService.getAll();
    }

    @GetMapping("/user/{userId}")
    public List<Opinion> getOpinionByUser(@PathVariable Long userId){
        return opinionService.getByUser(userId);
    }
}

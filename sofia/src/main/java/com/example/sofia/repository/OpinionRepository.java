package com.example.sofia.repository;

import com.example.sofia.models.Opinion.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OpinionRepository extends JpaRepository<Opinion, Long> {
    List<Opinion> findByUserId(Long userId);
}

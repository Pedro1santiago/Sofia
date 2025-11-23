package com.example.sofia.repository;

import com.example.sofia.models.UserInteraction.UserInteraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInteractionRepository extends JpaRepository<UserInteraction, Long> {
}

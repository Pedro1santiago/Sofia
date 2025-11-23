package com.example.sofia.repository;

import com.example.sofia.models.context.Context;
import com.example.sofia.models.context.Context;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContextRepository extends JpaRepository<Context, Long> {

    @Query("SELECT d FROM Discussion d WHERE LOWER(d.title) LIKE LOWER(CONCAT('%', :text, '%')) " +
            "OR LOWER(d.description) LIKE LOWER(CONCAT('%', :text, '%'))")
    List<Context> searchByText(@Param("text") String text);
}

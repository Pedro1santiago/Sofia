package com.example.sofia.repository;

import com.example.sofia.models.Opinion.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OpinionRepository extends JpaRepository<Opinion, Long> {

    List<Opinion> findByUserId(Long userId);

    // Filtro por localização, relevância mínima e contexto
    @Query("SELECT o FROM Opinion o " +
            "WHERE (:estado IS NULL OR o.user.estado = :estado) " +
            "AND (:cidade IS NULL OR o.user.cidade = :cidade) " +
            "AND (:bairro IS NULL OR o.user.bairro = :bairro) " +
            "AND o.relevancia >= :minRelevancia " +
            "AND (:contextId IS NULL OR o.context.id = :contextId)")
    List<Opinion> findByFilters(
            @Param("estado") String estado,
            @Param("cidade") String cidade,
            @Param("bairro") String bairro,
            @Param("minRelevancia") Integer minRelevancia,
            @Param("contextId") Long contextId
    );
}

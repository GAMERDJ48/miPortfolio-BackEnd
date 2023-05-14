package com.yoprogramo.portfolio.repositories;

import com.yoprogramo.portfolio.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
    @Query(value = "SELECT * FROM persona e WHERE e.id = (SELECT MAX(id) FROM persona)", nativeQuery = true)
    Optional<Persona> findLast();
}

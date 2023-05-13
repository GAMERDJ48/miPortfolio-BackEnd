package com.yoprogramo.portfolio.repositories;

import com.yoprogramo.portfolio.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}

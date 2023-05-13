package com.yoprogramo.portfolio.services;

import com.yoprogramo.portfolio.entities.Habilidad;
import com.yoprogramo.portfolio.entities.Habilidad;
import com.yoprogramo.portfolio.entities.Persona;
import com.yoprogramo.portfolio.repositories.BaseRepository;
import com.yoprogramo.portfolio.repositories.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class HabilidadService extends BaseService<Habilidad,Long> {
    @Autowired
    HabilidadRepository repository;
    @Autowired
    PersonaService personaService;

    public HabilidadService(BaseRepository<Habilidad,Long> baseRepository){
        super(baseRepository);
    }

    @Override
    @Transactional
    public Habilidad save(Habilidad entity) throws Exception {
        Persona persona = personaService.findLast();
        persona.setHabilidades(personaService.addList(persona.getHabilidades(), entity));
        entity = super.save(entity);
        personaService.update(persona.getId(), persona);
        return entity;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        Persona persona = personaService.findLast();
        persona.setHabilidades(deleteItemOfList(persona.getHabilidades(), id));
        personaService.update(persona.getId(),persona);
        return super.delete(id);
    }
}

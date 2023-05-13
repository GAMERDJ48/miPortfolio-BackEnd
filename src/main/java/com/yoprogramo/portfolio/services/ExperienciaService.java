package com.yoprogramo.portfolio.services;

import com.yoprogramo.portfolio.entities.Contacto;
import com.yoprogramo.portfolio.entities.Experiencia;
import com.yoprogramo.portfolio.entities.Persona;
import com.yoprogramo.portfolio.repositories.BaseRepository;
import com.yoprogramo.portfolio.repositories.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ExperienciaService extends BaseService<Experiencia,Long> {
    @Autowired
    ExperienciaRepository repository;
    @Autowired
    PersonaService personaService;

    public ExperienciaService(BaseRepository<Experiencia,Long> baseRepository){
        super(baseRepository);
    }

    @Override
    @Transactional
    public Experiencia save(Experiencia entity) throws Exception {
        Persona persona = personaService.findLast();
        persona.setExperiencias(personaService.addList(persona.getExperiencias(), entity));
        entity = super.save(entity);
        personaService.update(persona.getId(), persona);
        return entity;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        Persona persona = personaService.findLast();
        persona.setExperiencias(deleteItemOfList(persona.getExperiencias(), id));
        personaService.update(persona.getId(),persona);
        return super.delete(id);
    }
}

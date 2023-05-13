package com.yoprogramo.portfolio.services;

import com.yoprogramo.portfolio.entities.Formacion;
import com.yoprogramo.portfolio.entities.Persona;
import com.yoprogramo.portfolio.repositories.BaseRepository;
import com.yoprogramo.portfolio.repositories.FormacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FormacionService extends BaseService<Formacion,Long> {
    @Autowired
    FormacionRepository repository;

    @Autowired
    PersonaService personaService;

    public FormacionService(BaseRepository<Formacion,Long> baseRepository){
        super(baseRepository);
    }

    @Override
    @Transactional
    public Formacion save(Formacion entity) throws Exception {
        Persona persona = personaService.findLast();
        persona.setFormacion(personaService.addList(persona.getFormacion(), entity));
        entity = super.save(entity);
        personaService.update(persona.getId(), persona);
        return entity;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        Persona persona = personaService.findLast();
        persona.setFormacion(deleteItemOfList(persona.getFormacion(), id));
        personaService.update(persona.getId(),persona);
        return super.delete(id);
    }
}

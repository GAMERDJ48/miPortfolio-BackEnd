package com.yoprogramo.portfolio.services;

import com.yoprogramo.portfolio.entities.Proyecto;
import com.yoprogramo.portfolio.entities.Persona;
import com.yoprogramo.portfolio.entities.Proyecto;
import com.yoprogramo.portfolio.repositories.BaseRepository;
import com.yoprogramo.portfolio.repositories.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProyectoService extends BaseService<Proyecto,Long> {
    @Autowired
    ProyectoRepository repository;
    @Autowired
    PersonaService personaService;

    public ProyectoService(BaseRepository<Proyecto,Long> baseRepository){
        super(baseRepository);
    }

    @Override
    @Transactional
    public Proyecto save(Proyecto entity) throws Exception {
        Persona persona = personaService.findLast();
        persona.setProyectos(personaService.addList(persona.getProyectos(), entity));
        entity = super.save(entity);
        personaService.update(persona.getId(), persona);
        return entity;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        Persona persona = personaService.findLast();
        persona.setProyectos(deleteItemOfList(persona.getProyectos(), id));
        personaService.update(persona.getId(),persona);
        return super.delete(id);
    }
}
package com.yoprogramo.portfolio.services;

import com.yoprogramo.portfolio.entities.*;
import com.yoprogramo.portfolio.repositories.BaseRepository;
import com.yoprogramo.portfolio.repositories.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Service
public class ContactoService extends BaseService<Contacto,Long> {
    @Autowired
    ContactoRepository repository;
    @Autowired
    PersonaService personaService;

    public ContactoService(BaseRepository<Contacto,Long> baseRepository){
        super(baseRepository);
    }

    @Override
    @Transactional
    public Contacto save(Contacto entity) throws Exception {
        Persona persona = personaService.findLast();
        persona.setContactos(personaService.addList(persona.getContactos(), entity));
        entity = super.save(entity);
        personaService.update(persona.getId(), persona);
        return entity;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        Persona persona = personaService.findLast();
        persona.setContactos(deleteItemOfList(persona.getContactos(), id));
        personaService.update(persona.getId(),persona);
        return super.delete(id);
    }
}

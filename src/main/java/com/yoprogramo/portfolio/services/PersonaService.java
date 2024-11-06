package com.yoprogramo.portfolio.services;

import com.yoprogramo.portfolio.entities.*;
import com.yoprogramo.portfolio.repositories.BaseRepository;
import com.yoprogramo.portfolio.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService extends BaseService<Persona,Long> {
    @Autowired
    PersonaRepository repository;

    public PersonaService(BaseRepository<Persona,Long> baseRepository){
        super(baseRepository);
    }

    public <E extends Base> List<E> addList(List<E> list, E elemento){
        if(list==null){
            list=new ArrayList<>();
        }
        list.add(elemento);
        return list;
    }

    public Persona findLast() throws Exception{
        try{
            Optional<Persona> last = repository.findLast();
            if(last.isPresent()){
                return last.get();
            }
            return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


}
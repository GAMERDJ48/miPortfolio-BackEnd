package com.yoprogramo.portfolio.services;


import com.yoprogramo.portfolio.entities.Base;
import com.yoprogramo.portfolio.entities.Experiencia;
import com.yoprogramo.portfolio.repositories.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;


public class BaseService<E extends Base, ID extends Serializable>{
    protected BaseRepository<E, ID> baseRepository;

    public BaseService(BaseRepository<E, ID> baseRepository){
        this.baseRepository = baseRepository;
    }

    @Transactional
    public Page<E> findPaginated(Pageable pageable) throws Exception{
        try{
            return baseRepository.findAll(pageable);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }


    @Transactional
    public List<E> findAll() throws Exception {
        try{
            return baseRepository.findAll();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }



    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            if(entityOptional.isPresent()) {return entityOptional.get();}
            else {return null;}
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E save(E entity) throws Exception {
        try{
            return baseRepository.save(entity);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            if(entityOptional.isPresent()){
                return baseRepository.save(entity);
            }else{
                throw new Exception("No se encontro la entidad");
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if(baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    public <E extends Base> List<E> deleteItemOfList(List<E> lista, Long id){
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getId()==id){
                System.out.println(lista.get(i).getId());
                lista.remove(i);
                break;
            }
        }
        return lista;
    }



}


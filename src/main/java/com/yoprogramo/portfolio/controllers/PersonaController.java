package com.yoprogramo.portfolio.controllers;

import com.yoprogramo.portfolio.entities.Persona;
import com.yoprogramo.portfolio.services.BaseService;
import com.yoprogramo.portfolio.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "portfolio/persona")
public class PersonaController extends BaseController<Persona> {

    @Autowired
    PersonaService service;

    public PersonaController(BaseService<Persona,Long> baseService){
        super(baseService);
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Persona entity){
        return super.save(entity);
    }

    @GetMapping("")
    public ResponseEntity<?> get(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findLast());
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Persona entity){
        return super.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return super.delete(id);
    }

}

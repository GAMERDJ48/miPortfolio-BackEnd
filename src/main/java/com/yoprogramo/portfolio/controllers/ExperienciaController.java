package com.yoprogramo.portfolio.controllers;

import com.yoprogramo.portfolio.entities.Experiencia;
import com.yoprogramo.portfolio.services.BaseService;
import com.yoprogramo.portfolio.services.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "portfolio/experiencia")
public class ExperienciaController extends BaseController<Experiencia> {

    @Autowired
    ExperienciaService service;

    public ExperienciaController(BaseService<Experiencia,Long> baseService){
        super(baseService);
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Experiencia entity){
        return super.save(entity);
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return super.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return super.getOne(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Experiencia entity){
        return super.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return super.delete(id);
    }

}

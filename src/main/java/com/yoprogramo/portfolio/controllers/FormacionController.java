package com.yoprogramo.portfolio.controllers;

import com.yoprogramo.portfolio.entities.Formacion;
import com.yoprogramo.portfolio.services.BaseService;
import com.yoprogramo.portfolio.services.FormacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "portfolio/formacion")
public class FormacionController extends BaseController<Formacion> {

    @Autowired
    FormacionService service;

    public FormacionController(BaseService<Formacion,Long> baseService){
        super(baseService);
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Formacion entity){
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
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Formacion entity){
        return super.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        return super.delete(id);
    }

}

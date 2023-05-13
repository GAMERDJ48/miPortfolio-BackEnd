package com.yoprogramo.portfolio.controllers;

import com.yoprogramo.portfolio.entities.Proyecto;
import com.yoprogramo.portfolio.services.BaseService;
import com.yoprogramo.portfolio.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "portfolio/proyecto")
public class ProyectoController extends BaseController<Proyecto> {

    @Autowired
    ProyectoService service;

    public ProyectoController(BaseService<Proyecto,Long> baseService){
        super(baseService);
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Proyecto entity){
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
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Proyecto entity){
        return super.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return super.delete(id);
    }

}

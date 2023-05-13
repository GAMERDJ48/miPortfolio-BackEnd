package com.yoprogramo.portfolio.services;

import com.yoprogramo.portfolio.entities.Usuario;
import com.yoprogramo.portfolio.repositories.BaseRepository;
import com.yoprogramo.portfolio.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends BaseService<Usuario,Long>{
    @Autowired
    UsuarioRepository repository;

    public UsuarioService(BaseRepository<Usuario,Long> baseRepository){
        super(baseRepository);
    }

}

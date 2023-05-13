package com.yoprogramo.portfolio.repositories;

import com.yoprogramo.portfolio.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario,Long> {
}

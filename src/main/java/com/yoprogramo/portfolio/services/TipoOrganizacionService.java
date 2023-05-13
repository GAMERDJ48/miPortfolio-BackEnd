package com.yoprogramo.portfolio.services;

import com.yoprogramo.portfolio.entities.TipoOrganizacion;
import com.yoprogramo.portfolio.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoOrganizacionService extends BaseService<TipoOrganizacion,Long> {
    @Autowired
    TipoOrganizacionService tipoOrganizacionService;

    public TipoOrganizacionService(BaseRepository<TipoOrganizacion,Long> baseRepository){
        super(baseRepository);
    }
}

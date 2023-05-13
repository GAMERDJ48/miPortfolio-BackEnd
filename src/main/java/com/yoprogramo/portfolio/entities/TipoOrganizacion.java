package com.yoprogramo.portfolio.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "tipoorganizacion")
@AllArgsConstructor
@NoArgsConstructor
public class TipoOrganizacion extends Base{
    private String nombre;

    @Override
    public String toString(){
        return ""+this.id;
    }
}

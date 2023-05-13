/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.entities;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter @Setter
@Table(name = "experiencia")
@AllArgsConstructor
@NoArgsConstructor
public class Experiencia extends Base {
    @NotEmpty(message = "{NotNull}")
    @Size(max=100, message = "{Size.Max.nombre}")
    private String puesto;

    @NotEmpty(message = "{NotNull}")
    @Size(max=100, message = "{Size.Max.nombre}")
    private String organizacion;
    @ManyToOne
    private TipoOrganizacion tipoOrganizacion;

    @Lob
    @Column(length = 500)
    private String descripcion;
    @Lob
    private String urlImagen;

    @NotNull(message = "{NotNull}")
    @Min(value=1900)
    @Max(value=10000)
    private Integer anioDesde;

    @Min(value=1900)
    @Max(value=10000)
    private Integer anioHasta;


}

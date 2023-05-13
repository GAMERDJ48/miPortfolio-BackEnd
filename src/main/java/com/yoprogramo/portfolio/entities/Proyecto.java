/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.*;

import java.util.List;

@Entity
@Getter @Setter
@Table(name = "proyecto")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Proyecto extends Base {
    @NotEmpty(message = "{NotNull}")
    @Size(max=100, message = "{Size.Max.nombre}")
    private String titulo;

    private String url;

    private String urlBack;

    @Size(max=300, message = "{Size.Max.descripcion}")
    private String descripcion;

    @ElementCollection
    @CollectionTable(name = "proyecto_tecnologias")
    @Column(name = "tecnologia")
    private List<String> stackTecnologico;

    @NotNull(message = "{NotNull}")
    @Min(value=1900)
    @Max(value=10000)
    private Integer anioDesde;

    @Min(value=1900)
    @Max(value=10000)
    private Integer anioHasta;
 
}

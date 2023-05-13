/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Model;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
@Table(name = "habilidad")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Habilidad extends Base{
    private String nombre;
    final int valorMax=100;
    private int nivelHabilidad; //Nivel entre 100 y 0
    TipoHabilidad tipoHabilidad;
}

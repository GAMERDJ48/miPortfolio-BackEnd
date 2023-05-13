/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.*;

@Entity
@Getter @Setter
@Table(name = "habilidad")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Habilidad extends Base{
    @NotEmpty(message = "{NotNull}")
    @Size(max=50, message = "Maximo de 50 caracteres")
    private String nombre;
    private int nivelHabilidad=0; //Nivel entre 100 y 0
}

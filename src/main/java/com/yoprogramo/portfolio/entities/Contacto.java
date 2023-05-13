/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.yoprogramo.portfolio.entities.Base;
import lombok.*;
@Entity
@Getter @Setter
@Table(name = "contacto")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contacto extends Base {
    @NotEmpty(message = "{NotNull}")
    @Size(max=30, message = "Maximo de caracteres de 30")
    private String nombre;
    @Lob
    private String url;

}

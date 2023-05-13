/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Model;

import javax.persistence.*;

import lombok.*;
@Entity
@Getter @Setter
@Table(name = "contacto")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contacto extends Base {

    private String nombre;
    private String urlContacto;
}

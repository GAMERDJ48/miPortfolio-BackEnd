/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Model;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
@Table(name = "proyecto")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Proyecto extends Base {
    private int ordenProyecto;
    private String tituloProyecto;
    private String urlProyecto;
    private String descripcion;
 
}

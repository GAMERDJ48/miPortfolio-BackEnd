/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Model;

import java.util.Date;
import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
@Table(name = "experiencia")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Experiencia extends Base {
    private String puesto;
    private String institución;
    private String urlImagen;
    private Date fechaDesde;
    private Date fechaHasta;
    
    
}

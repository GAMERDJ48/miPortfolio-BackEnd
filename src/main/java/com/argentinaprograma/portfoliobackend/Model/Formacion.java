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
@Table(name = "formacion")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Formacion extends Base {

    private String institucion;
    private String carrera;
    private String urlImagen;
    private Date fechaFin;


}

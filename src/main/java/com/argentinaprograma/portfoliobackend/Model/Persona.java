/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter @Setter
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Persona extends Base {
    @NotEmpty(message = "{NotNull}")
    @Size(max=100, message = "{Size.Max.nombre}")
    private String nombre;

    @NotEmpty(message = "{NotNull.valor}")
    @Size(max=100, message = "{Size.Max.nombre}")
    private String apellido;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "{NotNull}")
    private LocalDate fechaNacimiento;

    @Size(max=300, message = "{Size.Max.descripcion}")
    private String descripcion;

    private String urlFoto;
    private String urlBanner;

    
    
    
}

package com.yoprogramo.portfolio.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario extends Base{
    private String username;
    private String password;
}

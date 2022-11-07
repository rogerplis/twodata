package com.roger.twodata.model.parking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Long IDUSUARIO;
    @Getter @Setter
    private String NOME;
    @Getter @Setter
    private String LOGIN;
    @Getter @Setter
    private String SENHA;


    public Usuario() {

    }
}

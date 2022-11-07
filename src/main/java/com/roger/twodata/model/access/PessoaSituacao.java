package com.roger.twodata.model.access;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA_SITUACAO")
@Getter
@Setter
public class PessoaSituacao {

    @Id
    private Long pessit_numero;
    private String pessit_descricao;
    private Integer pessit_status;

    public PessoaSituacao() {
    }

    public PessoaSituacao(Long pessit_numero, String pessit_descricao, Integer pessit_status) {
        this.pessit_numero = pessit_numero;
        this.pessit_descricao = pessit_descricao;
        this.pessit_status = pessit_status;
    }
}

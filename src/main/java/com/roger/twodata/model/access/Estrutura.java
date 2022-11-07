package com.roger.twodata.model.access;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "ESTRUTURA")
public class Estrutura {

    @Id
    private Long est_numero;
    private String est_descricao;
    private String est_logo;
    private Boolean est_empresa;


    public Estrutura() {
    }

    public Estrutura(Long est_numero, String est_descricao, String est_logo, Boolean est_empresa) {
        this.est_numero = est_numero;
        this.est_descricao = est_descricao;
        this.est_logo = est_logo;
        this.est_empresa = est_empresa;
    }

}

package com.roger.twodata.model.access;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "CREDENCIAL_TIPO")
public class CredencialTipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long crti_numero;
    private String crti_descricao;
    private Integer crti_autenticacao;

    public CredencialTipo() {
    }

    public CredencialTipo(Long crti_numero, String crti_descricao, Integer crti_autenticacao) {
        this.crti_numero = crti_numero;
        this.crti_descricao = crti_descricao;
        this.crti_autenticacao = crti_autenticacao;
    }
}

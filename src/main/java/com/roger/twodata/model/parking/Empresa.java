package com.roger.twodata.model.parking;


import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Empresa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long IDEMPRESA;
    @Getter
    @Setter
    private String NOME;
    @Getter @Setter private String CNPJ;
    @Getter
    @Setter
    private int CODIGODOCLIENTE;
    @Getter
    @Setter
    private String INSCRICAOESTADUAL;
    @Getter
    @Setter
    private String INSCRICAOMUNICIPAL;
    @Getter
    @Setter
    private String CODIGOAGENCIA;
    @Getter
    @Setter
    private String CODIGOCEDENTE;
    @Getter
    @Setter
    private int ULTIMOCODIGOBOLETO;
    @Getter
    @Setter
    private String ENDERECOLICENCA;
    @Getter
    @Setter
    private int PRAZOPAGAMENTO;
    @Getter
    @Setter
    private String CONTACORRENTE;
    @Getter
    @Setter
    private String ENDERECO;
    @Getter
    @Setter
    private Instant DATAHORAATUALIZACAO;
    @Getter
    @Setter
    private String CIDADE;
    @Getter
    @Setter
    private String UF;
    @Getter
    @Setter
    private String TELEFONE;
    @Getter
    @Setter
    private String FAX;
    @Getter
    @Setter
    private String NUMERO;
    @Getter
    @Setter
    private String COMPLEMENTO;
    @Getter
    @Setter
    private String BAIRRO;
    @Getter
    @Setter
    private String CEP;
    @Getter
    @Setter
    private String NOMECONTATO;
    @Getter
    @Setter
    private String CODMUNICIPIODOMFISCAL;
    @Getter
    @Setter
    private String EMAIL;


    public Empresa() {
    }



}

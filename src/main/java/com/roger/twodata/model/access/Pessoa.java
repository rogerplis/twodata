package com.roger.twodata.model.access;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "pessoas")
@Getter
@Setter
@Table(name = "PESSOAS")
public class Pessoa {

    @Id
    @Column(name = "pes_numero")
    private Long id;
    @Column(name = "pes_nome")
    private String nome;
    @Column(name = "pes_cpf")
    private String cpf;
    @Column(name = "pes_obs")
    private String obs;
    @Column(name = "pes_email")
    private String email;
    private String pes_rg;
    private char pes_flagreentrada;
    private char pes_master;
    private String pes_foto;
    private String pes_senha;
    private String pes_ramal;
    private String pes_campoperso1;
    private String pes_campoperso2;
    private String pes_campoperso3;
    private String pes_campoperso4;
    private String pes_campoperso5;
    private LocalDateTime pes_dtsitinicial;
    private LocalDateTime pes_dtsitfinal;
    private String cred_prov;
    private Integer reg_numero;
    private Integer rfa_numero;
    private Long emp_numero;
    private LocalDateTime pes_recolheprov;
    private Long pes_pis;
    private Long est_numero;
    private Long pessit_numero;


    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String cpf, String obs, String email, String pes_rg, char pes_flagreentrada, char pes_master, String pes_foto, String pes_senha, String pes_ramal, String pes_campoperso1, String pes_campoperso2, String pes_campoperso3, String pes_campoperso4, String pes_campoperso5, LocalDateTime pes_dtsitinicial, LocalDateTime pes_dtsitfinal, String cred_prov, Integer reg_numero, Integer rfa_numero, Long emp_numero, LocalDateTime pes_recolheprov, Long pes_pis, Long est_numero, Long pessit_numero) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.obs = obs;
        this.email = email;
        this.pes_rg = pes_rg;
        this.pes_flagreentrada = pes_flagreentrada;
        this.pes_master = pes_master;
        this.pes_foto = pes_foto;
        this.pes_senha = pes_senha;
        this.pes_ramal = pes_ramal;
        this.pes_campoperso1 = pes_campoperso1;
        this.pes_campoperso2 = pes_campoperso2;
        this.pes_campoperso3 = pes_campoperso3;
        this.pes_campoperso4 = pes_campoperso4;
        this.pes_campoperso5 = pes_campoperso5;
        this.pes_dtsitinicial = pes_dtsitinicial;
        this.pes_dtsitfinal = pes_dtsitfinal;
        this.cred_prov = cred_prov;
        this.reg_numero = reg_numero;
        this.rfa_numero = rfa_numero;
        this.emp_numero = emp_numero;
        this.pes_recolheprov = pes_recolheprov;
        this.pes_pis = pes_pis;
        this.est_numero = est_numero;
        this.pessit_numero = pessit_numero;
    }
}

package com.roger.twodata.model.access;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "CREDENCIAIS")
public class Credencial {

    @Id
    @Column(name = "cred_numero")
    private String crednumero;
    private Boolean cred_flagreentrada;
    private Integer cred_areanomomento;
    private LocalDateTime cred_dtvalidinicial;
    private LocalDateTime cred_dtvalidfinal;
    private Boolean cred_bloqueada;
    private Boolean cred_flagcatraca;
    private Integer crti_numero;
    private Boolean cred_master;
    private LocalDateTime cred_ultpassagem;
    private Integer cred_eqpinumero;
    private String cred_senha;
    private Boolean cred_prov;
    private Boolean cred_provdevolv;
    private Integer cred_numra;
    private String cred_motivobloqueio;

    public Credencial() {
    }

    public Credencial(String crednumero, Boolean cred_flagreentrada, Integer cred_areanomomento,
                      LocalDateTime cred_dtvalidinicial, LocalDateTime cred_dtvalidfinal,
                      Boolean cred_bloqueada, Boolean cred_flagcatraca, Integer crti_numero,
                      Boolean cred_master, LocalDateTime cred_ultpassagem, Integer cred_eqpinumero,
                      String cred_senha, Boolean cred_prov, Boolean cred_provdevolv, Integer cred_numra,
                      String cred_motivobloqueio) {
        this.crednumero = crednumero;
        this.cred_flagreentrada = cred_flagreentrada;
        this.cred_areanomomento = cred_areanomomento;
        this.cred_dtvalidinicial = cred_dtvalidinicial;
        this.cred_dtvalidfinal = cred_dtvalidfinal;
        this.cred_bloqueada = cred_bloqueada;
        this.cred_flagcatraca = cred_flagcatraca;
        this.crti_numero = crti_numero;
        this.cred_master = cred_master;
        this.cred_ultpassagem = cred_ultpassagem;
        this.cred_eqpinumero = cred_eqpinumero;
        this.cred_senha = cred_senha;
        this.cred_prov = cred_prov;
        this.cred_provdevolv = cred_provdevolv;
        this.cred_numra = cred_numra;
        this.cred_motivobloqueio = cred_motivobloqueio;
    }
}

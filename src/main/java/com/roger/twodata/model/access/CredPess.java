package com.roger.twodata.model.access;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "CRED_PESSOAS")
public class CredPess {

    @Id
    private String cred_numero;
    private Long pes_numero;
    private LocalDateTime crpes_dataentrada;
    private LocalDateTime crpes_datasaida;

}

package com.roger.twodata.model.parking;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
public class Venda {
    @Id
    @Getter
    private Long IDVENDA;
    @Getter
    private LocalDateTime DATAHORAVENDA;
    @Getter
    private int IDCAIXA;
    @Getter
    private Double RECEBIDO;
    @Getter
    private Double TROCO;

    public Venda() {

    }

    public double valorVenda(Double RECEBIDO, Double TROCO){
        return RECEBIDO - TROCO;
    }
}

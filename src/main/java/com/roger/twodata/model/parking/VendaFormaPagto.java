package com.roger.twodata.model.parking;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Embeddable
public class VendaFormaPagto  {

    @EmbeddedId
    UnionID id = new UnionID();
    @Getter
    private int IDFORMADEPAGAMENTO;
    @Getter
    private Double VALOR;
    @Getter
    private LocalDateTime DATAHORAATUALIZACAO;
    @Getter
    @OneToOne
    @JoinColumn(name = "IDVENDA")
    private Venda venda;

    public VendaFormaPagto() {
    }



}

package com.roger.twodata.model.parking;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
public class ResultVenda {

    public Long caixa;
    public int formapagto;
    public Double valor;
    public Double recebido;
    public Double troco;

    public ResultVenda() {
    }


    public static ResultVenda resultVenda(VendaFormaPagto vendaFormaPagto, Venda venda){
        return new ResultVenda((long) venda.getIDCAIXA(),vendaFormaPagto.getIDFORMADEPAGAMENTO(),vendaFormaPagto.getVALOR(),venda.getRECEBIDO(),venda.getTROCO());
}
}

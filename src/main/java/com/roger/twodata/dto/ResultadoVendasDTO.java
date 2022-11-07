package com.roger.twodata.dto;

import com.roger.twodata.model.parking.ResultVenda;
import com.roger.twodata.model.parking.Venda;
import com.roger.twodata.model.parking.VendaFormaPagto;

import java.util.List;

public class ResultadoVendasDTO {
    public Long caixa;
    public int formapagto;
    public Double valor;
    public Double recebido;
    public Double troco;

    public ResultadoVendasDTO() {
    }

    public ResultadoVendasDTO(Long caixa, int formapagto, Double valor, Double recebido, Double troco) {
        this.caixa = caixa;
        this.formapagto = formapagto;
        this.valor = valor;
        this.recebido = recebido;
        this.troco = troco;
    }

    public static ResultVenda resultVenda(VendaFormaPagto vendaFormaPagto, Venda venda){
        return new ResultVenda((long) venda.getIDCAIXA(),vendaFormaPagto.getIDFORMADEPAGAMENTO(),vendaFormaPagto.getVALOR(),venda.getRECEBIDO(),venda.getTROCO());
    }

}

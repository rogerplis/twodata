package com.roger.twodata.services.parking;

import com.roger.twodata.model.parking.CaixaControle;
import com.roger.twodata.model.parking.ResultVenda;
import com.roger.twodata.model.parking.Venda;
import com.roger.twodata.repositories.parking.VendaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VendaServiceImpl implements VendaService{

    @Autowired
    private VendaRepositories repositories;


    public List findAll() {
        return repositories.findAll();
    }
    public Venda findById(Long id) {
        Optional obj = repositories.findById(id);
        return (Venda) obj.get();
    }
    public List<Venda> findByData(LocalDateTime dataIn) {
        return repositories.findVendaByDATAHORAVENDAAfter(dataIn);
    }

    @Override
    public List obterVenda() {
        return this.repositories.findAll();
    }
}

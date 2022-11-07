package com.roger.twodata.services.parking;

import com.roger.twodata.model.parking.Venda;
import com.roger.twodata.model.parking.VendaFormaPagto;
import com.roger.twodata.repositories.parking.VendaFormaPagtoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VendaFormaPagtoServiceImpl implements VendaFormaPagtoService{

    @Autowired
    private VendaFormaPagtoRepositories repositories;


    public List findAll() {
        return repositories.findAll();
    }

    public Venda findById(Long id) {
        Optional obj = repositories.findById(id);
        return (Venda) obj.get();
    }
    public List<VendaFormaPagto> findByData(LocalDateTime dataIn) {
        return repositories.findVendaFormaPagtoByDATAHORAATUALIZACAOAfter(dataIn);
    }

    @Override
    public List<VendaFormaPagto> obterVendas() {
        return null;
    }
}

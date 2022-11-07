package com.roger.twodata.services.parking;

import com.roger.twodata.model.parking.Caixa;
import com.roger.twodata.repositories.parking.CaixaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaixaServiceImpl implements CaixaService{

    @Autowired
    private CaixaRepositories repositories;


    public List<Caixa> findAll() {
        return repositories.findAll();
    }
    public Caixa findById(Long id) {
        Optional<Caixa> obj = repositories.findById(id);
        return obj.get();
    }

    @Override
    public List<Caixa> obterCaixa() {
        return this.repositories.findAll();
    }
}

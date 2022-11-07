package com.roger.twodata.services.parking;

import com.roger.twodata.model.parking.Empresa;
import com.roger.twodata.repositories.parking.EmpresaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService{

    @Autowired
    private EmpresaRepositories repositories;


    public List<Empresa> findAll() {
        return repositories.findAll();
    }
    public Empresa findById(Long id) {
        Optional<Empresa> obj = repositories.findById(id);
        return obj.get();
    }

    @Override
    public List<Empresa> obterEmpresa() {
        return this.repositories.findAll();
    }
}

package com.roger.twodata.services.parking;

import com.roger.twodata.model.parking.CaixaControle;
import com.roger.twodata.repositories.parking.CaixaControleRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CaixaControleServiceImpl implements CaixaControleService{

    @Autowired
    private CaixaControleRepositories repositories;


    public List<CaixaControle> findAll() {
        return repositories.findAll();
    }
    public CaixaControle findById(Long id) {
        Optional<CaixaControle> obj = repositories.findById(id);
        return obj.get();
    }
    public List<CaixaControle> findByData(LocalDateTime dataIn,  LocalDateTime dataFin) {
        return repositories.findAllByDATAHORAABERTURABetween(dataIn, dataFin);
    }

    @Override
    public List<CaixaControle> obterCaixaControle() {
        return this.repositories.findAll();
    }
}

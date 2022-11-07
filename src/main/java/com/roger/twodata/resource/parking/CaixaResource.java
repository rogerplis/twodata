package com.roger.twodata.resource.parking;

import com.roger.twodata.model.parking.Caixa;
import com.roger.twodata.services.parking.CaixaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/caixa")
public class CaixaResource {

    @Autowired
    private CaixaServiceImpl service;

    @GetMapping
    public ResponseEntity<List<Caixa>> findAll(){
        List<Caixa> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }


}

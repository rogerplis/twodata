package com.roger.twodata.resource.parking;

import com.roger.twodata.model.parking.Empresa;
import com.roger.twodata.services.parking.EmpresaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/parkingcontrole/empresa")
public class EmpresaResource {

    @Autowired
    private EmpresaServiceImpl service;

    @GetMapping
    public ResponseEntity<List<Empresa>> findAll(){
        List<Empresa> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }


}

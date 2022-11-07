package com.roger.twodata.resource.parking;

import com.roger.twodata.model.parking.ResultVenda;
import com.roger.twodata.model.parking.Venda;
import com.roger.twodata.services.parking.VendaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/venda")
public class VendaResource {

    @Autowired
    private VendaServiceImpl service;

    @GetMapping
    public ResponseEntity<List<Venda>> findByData(){
        List<Venda> list = service.findByData(LocalDateTime.parse("2021-01-22T06:30:50"));
        return ResponseEntity.ok().body(list);
    }


}

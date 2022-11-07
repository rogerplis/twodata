package com.roger.twodata.resource.parking;

import com.roger.twodata.dto.ResultadoVendasDTO;
import com.roger.twodata.model.parking.Venda;
import com.roger.twodata.model.parking.VendaFormaPagto;
import com.roger.twodata.services.parking.VendaFormaPagtoServiceImpl;
import com.roger.twodata.services.parking.VendaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping(value = "/vendas")
public class VendaFormaPagtoResource {

    @Autowired
    private VendaFormaPagtoServiceImpl service;

    @GetMapping
    public ResponseEntity<List<VendaFormaPagto>> findByData(){
        List<VendaFormaPagto> list = service.findByData(LocalDateTime.parse("2021-01-22T06:30:50"));
        return ResponseEntity.ok().body(list);
    }


}

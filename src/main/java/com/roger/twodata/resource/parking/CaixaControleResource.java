package com.roger.twodata.resource.parking;

import com.roger.twodata.model.parking.CaixaControle;
import com.roger.twodata.services.parking.CaixaControleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/caixacontrole")
public class CaixaControleResource {

    @Autowired
    private CaixaControleServiceImpl service;

    @GetMapping
    public ResponseEntity<List<CaixaControle>> findByData()  {
        List<CaixaControle> list = service.findByData(
               LocalDateTime.parse("2021-01-01T06:30:50"),
                LocalDateTime.parse("2021-01-20T20:30:50"));
        return ResponseEntity.ok().body(list);
    }


}

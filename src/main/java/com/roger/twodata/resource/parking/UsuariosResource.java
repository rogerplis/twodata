package com.roger.twodata.resource.parking;

import com.roger.twodata.model.parking.Usuario;
import com.roger.twodata.services.parking.UsuariosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/parkingcontrole/usuarios")
public class UsuariosResource {

    @Autowired
    private UsuariosServiceImpl service;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }


}

package com.roger.twodata.resource.access;

import com.roger.twodata.model.access.CredencialTipo;
import com.roger.twodata.repositories.access.CredencialTipoRepo;
import com.roger.twodata.services.access.impl.CredencialTipoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/acessocontrole")
public class CredencialTipoResource {

    @Autowired
    private CredencialTipoServiceImpl service;

    @Autowired
    private CredencialTipoRepo repo;

    @RequestMapping(path="/credencialtipo", method = RequestMethod.POST)
    public ResponseEntity<Object> cadastrar(@RequestBody CredencialTipo CredencialTipo) {
        // recupera o cpf vindo pelo body
        /*String CredencialTiponumero = CredencialTipo.getCrednumero();
        // verifica se o cpf ja esta cadatrado
        if (repo.existsByCrednumero(CredencialTiponumero)) {
            return ResponseEntity.ok(" CredencialTipo  : " + CredencialTiponumero + "Já esta cadastrada");
        }*/
        // cadastra a CredencialTipo
        service.cadastrar(CredencialTipo);
        return ResponseEntity.ok("Cadastrada com Sucesso");
    }
    @RequestMapping(path="/credencialtipo", method = RequestMethod.GET)
    public ResponseEntity<List<CredencialTipo>> listarTodos(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @RequestMapping(path="/credencialtipo", method = RequestMethod.PUT)
    public ResponseEntity<CredencialTipo> atualizar(@RequestBody CredencialTipo CredencialTipo) {
       return ResponseEntity.ok(service.atualizar(CredencialTipo));
    }

    @RequestMapping(path="/credencialtipo/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> remover(@PathVariable(name = "id") Long id) {
        this.service.deletar(id);
        return ResponseEntity.ok("Excluido com sucesso");
    }
}

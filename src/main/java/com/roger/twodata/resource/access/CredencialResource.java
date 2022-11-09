package com.roger.twodata.resource.access;

import com.roger.twodata.model.access.Credencial;
import com.roger.twodata.repositories.access.CredencialRepo;
import com.roger.twodata.services.access.impl.CredencialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/acessocontrole")
public class CredencialResource {

    @Autowired
    private CredencialServiceImpl service;

    @Autowired
    private CredencialRepo repo;

    @RequestMapping(path="/credencial", method = RequestMethod.POST)
    public ResponseEntity<Object> cadastrar(@RequestBody Credencial Credencial) {
        // recupera o cpf vindo pelo body
        String Credencialnumero = Credencial.getCrednumero();
        // verifica se o cpf ja esta cadatrado
        if (repo.existsByCrednumero(Credencialnumero)) {
            return ResponseEntity.ok(" Credencial  : " + Credencialnumero + "Já esta cadastrada");
        }
        // cadastra a Credencial
        service.cadastrar(Credencial);
        return ResponseEntity.ok("Cadastrada com Sucesso");
    }
    @RequestMapping(path="/credencial", method = RequestMethod.GET)
    public ResponseEntity<List<Credencial>> listarTodos(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @RequestMapping(path="/credencial", method = RequestMethod.PUT)
    public ResponseEntity<Credencial> atualizar(@RequestBody Credencial Credencial) {
       return ResponseEntity.ok(service.atualizar(Credencial));
    }

    @RequestMapping(path="/credencial/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> remover(@PathVariable(name = "id") String id) {
        this.service.deletar(id);
        return ResponseEntity.ok("Excluido com sucesso");
    }
}

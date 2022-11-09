package com.roger.twodata.resource.access;

import com.roger.twodata.model.access.CredPess;
import com.roger.twodata.repositories.access.CredPessRepo;
import com.roger.twodata.services.access.impl.CredPessServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/acessocontrole")
public class CredPessResource {

    @Autowired
    private CredPessServiceImpl service;

    @Autowired
    private CredPessRepo repo;

    @RequestMapping(path="/credpess", method = RequestMethod.POST)
    public ResponseEntity<Object> cadastrar(@RequestBody CredPess CredPess) {
        // cria a data e hora da validade da credencial
        LocalDateTime CRPES_DATAENTRADA = LocalDateTime.now();
        LocalDateTime CRPES_DATASAIDA = CRPES_DATAENTRADA.plusYears(10);
        CredPess.setCrpes_dataentrada(CRPES_DATAENTRADA);
        CredPess.setCrpes_datasaida(CRPES_DATASAIDA);
        // verifica se o cpf ja esta cadatrado
        /*if (repo.existsByCrednumero(CredPessnumero)) {
            return ResponseEntity.ok(" CredPess  : " + CredPessnumero + "Já esta cadastrada");
        }*/
        // cadastra a CredPess
        service.cadastrar(CredPess);
        return ResponseEntity.ok("Cadastrada com Sucesso");
    }
    @RequestMapping(path="/CredPess", method = RequestMethod.GET)
    public ResponseEntity<List<CredPess>> listarTodos(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @RequestMapping(path="/CredPess", method = RequestMethod.PUT)
    public ResponseEntity<CredPess> atualizar(@RequestBody CredPess CredPess) {
       return ResponseEntity.ok(service.atualizar(CredPess));
    }

    @RequestMapping(path="/CredPess/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> remover(@PathVariable(name = "id") Long id) {
        this.service.deletar(id);
        return ResponseEntity.ok("Excluido com sucesso");
    }
}

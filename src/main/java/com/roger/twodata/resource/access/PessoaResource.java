package com.roger.twodata.resource.access;

import com.roger.twodata.model.access.Pessoa;
import com.roger.twodata.repositories.access.PessoaRepo;
import com.roger.twodata.services.access.impl.PessoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/acessocontrole")
public class PessoaResource {

    @Autowired
    private PessoaServiceImpl service;

    @Autowired
    private PessoaRepo repo;

    @RequestMapping(path="/pessoa", method = RequestMethod.POST)
    public ResponseEntity<Object> cadastrar(@RequestBody Pessoa pessoa) {
        // recupera o cpf vindo pelo body
        String pessoacpf = pessoa.getCpf();
        // verifica se o cpf ja esta cadatrado
        if (repo.existsByCpf(pessoacpf)) {
            return ResponseEntity.ok(" o CPF : " + pessoacpf + "Já esta cadastrado");
        }
        // cadastra a pessoa
        service.cadastrar(pessoa);
        return ResponseEntity.ok("Cadastrada com Sucesso");
    }
    @RequestMapping(path="/pessoa", method = RequestMethod.GET)
    public ResponseEntity<List<Pessoa>> listarTodos(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @RequestMapping(path="/pessoa", method = RequestMethod.PUT)
    public ResponseEntity<Pessoa> atualizar(@RequestBody Pessoa pessoa) {
       return ResponseEntity.ok(service.atualizar(pessoa));
    }

    @RequestMapping(path="/pessoa/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> remover(@PathVariable(name = "id") Long id) {
        this.service.deletar(id);
        return ResponseEntity.ok("Excluido com sucesso");
    }
}

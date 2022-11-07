package com.roger.twodata.resource.access;

import com.roger.twodata.model.access.Pessoa;
import com.roger.twodata.services.access.impl.PessoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/acessocontrole")
public class PessoaResource {

    @Autowired
    private PessoaServiceImpl service;

    @RequestMapping(path="/pessoa", method = RequestMethod.POST)
    public ResponseEntity<Object> cadastrar(@RequestBody Pessoa pessoa) {
        // recupera o cpf vindo pelo body
        String pessoacpf = pessoa.getPes_cpf();

        // verifica se o cpf ja esta cadatrado
        /*if (service.buscarCPF(pessoacpf).isPresent()) {
            return ResponseEntity.ok(" o CPF : " + pessoacpf + "Já esta cadastrado");
        }*/
        // cadastra a pessoa
        service.cadastrar(pessoa);
        return ResponseEntity.ok("Cadastrada com Sucesso");
    }
}

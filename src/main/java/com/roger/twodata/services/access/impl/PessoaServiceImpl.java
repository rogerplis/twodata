package com.roger.twodata.services.access.impl;

import com.roger.twodata.model.access.Pessoa;
import com.roger.twodata.repositories.access.PessoaRepo;
import com.roger.twodata.services.access.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

   @Autowired
   private PessoaRepo repo;

    @Override
    public List<Pessoa> listarTodos() {
        return this.repo.findAll();
    }
    @Override
    public Pessoa cadastrar(Pessoa pessoa) {
        return this.repo.save(pessoa);
    }
    @Override
    public Pessoa atualizar(Pessoa pessoa) {
        return this.repo.save(pessoa);
    }
   /* @Override
    public Optional<Pessoa> buscarCPF(String cpf) {
        return this.repo.findPessoaByPes_cpf(cpf);
    }*/
    @Override
    public void deletar(Long id) {
        this.repo.deleteById(id);
    }
}

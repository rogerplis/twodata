package com.roger.twodata.services.access.impl;

import com.roger.twodata.model.access.Estrutura;
import com.roger.twodata.repositories.access.EstruturaRepo;
import com.roger.twodata.services.access.EstruturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstruturaServiceImpl implements EstruturaService {

   @Autowired
   private EstruturaRepo repo;

    @Override
    public List<Estrutura> listarTodos() {
        return this.repo.findAll();
    }
    @Override
    public Estrutura cadastrar(Estrutura estrutura) {
        return this.repo.save(estrutura);
    }
    @Override
    public Estrutura atualizar(Estrutura estrutura) {
        return this.repo.save(estrutura);
    }
    /*@Override
    public Optional<Estrutura> buscarDescricao(String descricao) {
        return this.repo.findEstruturasByEst_descricao(descricao);
    }*/
    @Override
    public void deletar(Long id) {
        this.repo.deleteById(id);
    }
}

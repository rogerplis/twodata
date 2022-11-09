package com.roger.twodata.services.access.impl;

import com.roger.twodata.model.access.Credencial;
import com.roger.twodata.repositories.access.CredencialRepo;
import com.roger.twodata.services.access.CredencialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredencialServiceImpl implements CredencialService {

   @Autowired
   private CredencialRepo repo;

    @Override
    public List<Credencial> listarTodos() {
        return this.repo.findAll();
    }
    @Override
    public Credencial cadastrar(Credencial credencial) {
        return this.repo.save(credencial);
    }
    @Override
    public Credencial atualizar(Credencial credencial) {
        return this.repo.save(credencial);
    }
   /* @Override
    public Optional<Credencial> buscarCPF(String cpf) {
        return this.repo.findCredencialByPes_cpf(cpf);
    }*/
    @Override
    public void deletar(String id) {
        this.repo.deleteById(id);
    }
}

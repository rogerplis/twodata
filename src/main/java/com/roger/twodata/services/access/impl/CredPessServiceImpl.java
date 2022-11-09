package com.roger.twodata.services.access.impl;

import com.roger.twodata.model.access.CredPess;
import com.roger.twodata.repositories.access.CredPessRepo;
import com.roger.twodata.services.access.CredPessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredPessServiceImpl implements CredPessService {

   @Autowired
   private CredPessRepo repo;

    @Override
    public List<CredPess> listarTodos() {
        return this.repo.findAll();
    }
    @Override
    public CredPess cadastrar(CredPess credPess) {
        return this.repo.save(credPess);
    }
    @Override
    public CredPess atualizar(CredPess credPess) {
        return this.repo.save(credPess);
    }
   /* @Override
    public Optional<CredPess> buscarCPF(String cpf) {
        return this.repo.findCredPessByPes_cpf(cpf);
    }*/
    @Override
    public void deletar(Long id) {
        this.repo.deleteById(id);
    }
}

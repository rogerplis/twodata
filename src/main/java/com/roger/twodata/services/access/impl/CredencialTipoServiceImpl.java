package com.roger.twodata.services.access.impl;

import com.roger.twodata.model.access.CredencialTipo;
import com.roger.twodata.repositories.access.CredencialTipoRepo;
import com.roger.twodata.services.access.CredenciaTipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredencialTipoServiceImpl implements CredenciaTipoService {

   @Autowired
   private CredencialTipoRepo repo;

    @Override
    public List<CredencialTipo> listarTodos() {
        return this.repo.findAll();
    }
    @Override
    public CredencialTipo cadastrar(CredencialTipo credencialTipo) {
        return this.repo.save(credencialTipo);
    }
    @Override
    public CredencialTipo atualizar(CredencialTipo credencialTipo) {
        return this.repo.save(credencialTipo);
    }
   /* @Override
    public Optional<CredencialTipo> buscarCPF(String cpf) {
        return this.repo.findCredencialTipoByPes_cpf(cpf);
    }*/
    @Override
    public void deletar(Long id) {
        this.repo.deleteById(id);
    }
}

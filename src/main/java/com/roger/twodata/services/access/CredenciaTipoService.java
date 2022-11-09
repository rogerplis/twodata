package com.roger.twodata.services.access;

import com.roger.twodata.model.access.CredencialTipo;


import java.util.List;

public interface CredenciaTipoService {
    List<CredencialTipo> listarTodos();
    CredencialTipo cadastrar(CredencialTipo credencialTipo);
    CredencialTipo atualizar(CredencialTipo credencialTipo);
    //Optional<CredencialTipo> buscarDescricao(String descricao);
    void deletar(Long id);

}

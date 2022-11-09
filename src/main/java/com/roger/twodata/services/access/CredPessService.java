package com.roger.twodata.services.access;

import com.roger.twodata.model.access.CredPess;


import java.util.List;

public interface CredPessService {
    List<CredPess> listarTodos();
    CredPess cadastrar(CredPess credPess);
    CredPess atualizar(CredPess credPess);
    //Optional<CredPess> buscarDescricao(String descricao);
    void deletar(Long id);

}

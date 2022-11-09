package com.roger.twodata.services.access;

import com.roger.twodata.model.access.Credencial;

import java.util.List;

public interface CredencialService {
    List<Credencial> listarTodos();
    Credencial cadastrar(Credencial credencial);
    Credencial atualizar(Credencial credencial);
    //Optional<Credencial> buscarDescricao(String descricao);
    void deletar(String id);

}

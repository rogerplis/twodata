package com.roger.twodata.services.access;

import com.roger.twodata.model.access.Estrutura;

import java.util.List;
import java.util.Optional;

public interface EstruturaService {
    List<Estrutura> listarTodos();
    Estrutura cadastrar(Estrutura estrutura);
    Estrutura atualizar(Estrutura estrutura);
    //Optional<Estrutura> buscarDescricao(String descricao);
    void deletar(Long id);

}

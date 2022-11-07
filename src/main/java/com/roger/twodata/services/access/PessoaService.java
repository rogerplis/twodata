package com.roger.twodata.services.access;

import com.roger.twodata.model.access.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaService {
    List<Pessoa> listarTodos();
    Pessoa cadastrar(Pessoa pessoa);
    Pessoa atualizar(Pessoa pessoa);
    //Optional<Pessoa> buscarCPF(String cpf);
    void deletar(Long id);

}

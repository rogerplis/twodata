package com.roger.twodata.repositories.access;

import com.roger.twodata.model.access.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepo extends JpaRepository<Pessoa, Long> {

    //Optional<Pessoa> findPessoaByPes_cpf(String cpf);

}

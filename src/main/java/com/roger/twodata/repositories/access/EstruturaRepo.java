package com.roger.twodata.repositories.access;

import com.roger.twodata.model.access.Estrutura;
import com.roger.twodata.model.access.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstruturaRepo extends JpaRepository<Estrutura, Long> {

   // Optional<Estrutura> findEstruturasByEst_descricao(String descricao);

}

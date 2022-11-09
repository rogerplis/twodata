package com.roger.twodata.repositories.access;

import com.roger.twodata.model.access.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredencialRepo extends JpaRepository<Credencial, String> {

    Boolean existsByCrednumero(String crednumero);
}

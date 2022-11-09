package com.roger.twodata.repositories.access;

import com.roger.twodata.model.access.Credencial;
import com.roger.twodata.model.access.CredencialTipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredencialTipoRepo extends JpaRepository<CredencialTipo, Long> {
}

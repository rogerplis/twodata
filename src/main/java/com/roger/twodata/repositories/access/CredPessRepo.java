package com.roger.twodata.repositories.access;

import com.roger.twodata.model.access.CredPess;
import com.roger.twodata.model.access.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredPessRepo extends JpaRepository<CredPess, Long> {
}

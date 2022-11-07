package com.roger.twodata.repositories.parking;

import com.roger.twodata.model.parking.Caixa;
import com.roger.twodata.model.parking.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaixaRepositories extends JpaRepository<Caixa, Long> {


}

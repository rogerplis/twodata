package com.roger.twodata.repositories.parking;

import com.roger.twodata.model.parking.ResultVenda;
import com.roger.twodata.model.parking.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface VendaRepositories extends JpaRepository<Venda, Long>  {

    List<Venda> findVendaByDATAHORAVENDAAfter(LocalDateTime DATAHORAVENDA);


}

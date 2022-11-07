package com.roger.twodata.repositories.parking;

import com.roger.twodata.model.parking.Venda;
import com.roger.twodata.model.parking.VendaFormaPagto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface VendaFormaPagtoRepositories extends JpaRepository<VendaFormaPagto, Long>  {

    List<VendaFormaPagto> findVendaFormaPagtoByDATAHORAATUALIZACAOAfter(LocalDateTime DATAHORAATUALIZACAO);

}

package com.roger.twodata.repositories.parking;

import com.roger.twodata.model.parking.CaixaControle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CaixaControleRepositories extends JpaRepository<CaixaControle, Long> {

    List<CaixaControle> findAllByDATAHORAABERTURABetween(
            LocalDateTime DATAHORAABERTURA, LocalDateTime DATAHORAFECHAMENTO);
}

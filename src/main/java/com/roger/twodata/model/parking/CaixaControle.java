package com.roger.twodata.model.parking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CaixaControle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long IDCAIXACONTROLE;
    @Getter
    private Long IDEMPRESA;
    @Getter
    private LocalDateTime DATAHORAABERTURA;
    @Getter
    private Long IDUSUARIOABERTURA;
    @Getter
    private LocalDateTime DATAHORAFECHAMENTO;
    @Getter
    private Long IDUSUARIOFECHAMENTO;
    @Getter
    private Long IDCAIXA;
    @Getter
    private int SEQABERTURA;
    @Getter
    private LocalDateTime DATAHORAATUALIZACAO;

}

package com.roger.twodata.model.parking;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Caixa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long IDCAIXA;
    @Getter @Setter
    private String DESCRICAO;
    @Getter @Setter
    private Boolean POSSUIGAVETADINHEIRO;
    @Getter @Setter
    private Boolean EXIBEPOPUPOCORRENCIATOTEM;
    @Getter @Setter
    private int TIPOCAIXA;
    @Getter @Setter
    private String NOMETERMINALAUTOATENDIMENTO;
    @Getter @Setter
    private Boolean AUTOATENDIMENTOATIVO;
    @Getter @Setter
    private Instant DATAHORAATUALIZACAO;
    @Getter @Setter
    private Boolean POSSUIINTEGRACAOTEF;

    @Getter
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "IDEMPRESA")
    private Empresa empresa;

    public Caixa() {

    }
}

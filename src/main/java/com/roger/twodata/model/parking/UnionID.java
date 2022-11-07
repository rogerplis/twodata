package com.roger.twodata.model.parking;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UnionID implements Serializable {
    @Column(name = "IDEMPRESA")
    private Long IDEMPRESA;

    @Column(name = "IDVENDAFORMAPAGTO")
    private Long IDVENDAFORMAPAGTO;

}

package it.sogei.svildep.entity.gestionedepositi;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagTipoCatasto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "D_TIPI_CATASTO")
public class TipoCatasto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_CATASTO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_CATASTO")
    private String descrizioneTipoCatasto;
    @Column(name = "CODI_CODICE_TIPO_CATASTO")
    private FlagTipoCatasto codiceTipoCatasto;
}

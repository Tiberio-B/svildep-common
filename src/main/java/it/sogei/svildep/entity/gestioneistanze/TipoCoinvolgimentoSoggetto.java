package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagTipoCoinvolgimento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "D_TIPI_COINVOLGIMENTO_SOGGETTO")
public class TipoCoinvolgimentoSoggetto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_COINVOLGIMENTO_SOGGETTO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_COINVOLGIMENTO_SOGGETTO")
    private String descrizioneTipo;
    @Column(name = "CODI_CODICE_TIPO_COINVOLGIMENTO_SOGGETTO")
    @Enumerated(EnumType.STRING)
    private FlagTipoCoinvolgimento flagTipoCoinvolgimento;
}

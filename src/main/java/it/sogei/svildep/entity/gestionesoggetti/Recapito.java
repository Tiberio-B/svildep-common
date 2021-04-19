package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "D_RECAPITI")
public class Recapito extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_RECAPITO")
    private Long id;
    @Column(name = "DATA_VALIDITA_DA")
    private LocalDate dataValiditaDa;
    @Column(name = "DATA_VALIDITA_A")
    private LocalDate dataValiditaA;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_RECAPITO_RECAPITI")
    private TipoRecapito tipoRecapito;
    @ManyToOne
    @JoinColumn(name = "FK1_SOGGETTI_RECAPITI")
    private Soggetto soggetto;

}

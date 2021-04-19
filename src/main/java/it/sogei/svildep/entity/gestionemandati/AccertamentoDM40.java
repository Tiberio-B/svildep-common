package it.sogei.svildep.entity.gestionemandati;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagSN;
import it.sogei.svildep.entity.gestionedocumenti.Fascicolo;
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
@Table(name = "D_ACCERTAMENTI_DM40")
public class AccertamentoDM40 extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_ACCERTAMENTO_DM40")
    private Long id;
    @Column(name = "DATA_ACCERTAMENTO")
    private LocalDate dataAccertamento;
    @Column(name = "CODI_CODICE_FISCALE_SOGGETTO")
    private String codiceFiscaleSoggetto;
    @Column(name = "IMPO_IMPORTO_INADEMPIENZA")
    private Long importoInadempienza;
    @Column(name = "TEXT_NOTE_INTEGRATIVE")
    private String noteIntegrative;
    @Column(name = "NUME_ID_PIGNORAMENTO")
    private Long idPignoramento;
    @Column(name = "FLAG_LIBERATORIA_INADEMPIENZA_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagLiberatoriaInadempienzaSN;
    @Column(name = "FLAG_NOTIFICA_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagNotificaSN;
    @Column(name = "DATA_NOTIFICA_PIGNORAMENTO")
    private LocalDate dataNotificaPignoramento;
    @Column(name = "NUME_ID_SOGGETTO_PIGNORANTE")
    private Long idSoggettoPignorante;
    @Column(name = "IMPO_IMPORTO_ACCERTAMENTO_NOTIFICATO")
    private Double importoAccertamentoNotificato;
    @Column(name = "TEXT_NOTE_INTEGRATIVE_NOTIFICA")
    private String noteIntegrativeNotifica;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_ACCERTAMENTO_DM40")
    private TipoAccertamentoDM40 tipoAccertamentoDM40;
    @OneToMany(mappedBy = "accertamentoDM40")
    private List<Fascicolo> fascicoli;
}

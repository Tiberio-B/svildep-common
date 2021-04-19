package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagSN;
import it.sogei.svildep.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.entity.gestionesoggetti.TipoSoggetto;
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
@Table(name = "D_PROPRIETARI_CATASTALI")
public class ProprietarioCatastale extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_PROPRIETARIO_CATASTALE")
    private Long id;
    @Column(name = "DESC_NOMINATIVO_PROPRIETARIO_CATASTALE")
    private String nominativoProprietario;
    @Column(name = "CODI_CF_PIVA")
    private String cfPiva;
    @Column(name = "FLAG_SOGGETTO_IRREPERIBILE_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN soggettoIrreperibile;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_SOGGETTO_PROPRIETARI_CATASTALI")
    private TipoSoggetto tipoSoggetto;
    @OneToOne
    @JoinColumn(name = "FK1_FASCICOLI_PROPRIETARI_CATASTALI")
    private Fascicolo fascicolo;
    @ManyToOne
    @JoinColumn(name = "FK1_DATI_CATASTALI_PROPRIETARI_CATASTALI")
    private DatoCatastale beneEspropriato;
}

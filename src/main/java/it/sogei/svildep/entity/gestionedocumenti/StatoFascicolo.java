package it.sogei.svildep.entity.gestionedocumenti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "D_STATI_FASCICOLO")
public class StatoFascicolo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_STATI_FASCICOLO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_STATO_FASCICOLO")
    private String descrizioneStatoFascicolo;
    @OneToMany(mappedBy = "statoFascicolo")
    private List<Fascicolo> fascicoli;
}

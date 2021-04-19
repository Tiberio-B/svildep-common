package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionesoggetti.Regione;
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
@Table(name = "D_OPERE")
public class Opera extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_OPERA")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_OPERA")
    private String descrizioneOpera;
    @ManyToOne
    @JoinColumn(name = "FK1_REGIONI_OPERE")
    private Regione regione;
    @OneToMany(mappedBy = "opera")
    private List<Istanza> istanze;
}

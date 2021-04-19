package it.sogei.svildep.entity.gestionesoggetti;

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
@Table(name = "D_STATI_ESTERI")
public class StatoEstero extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_STATO_ESTERO")
    private Long id;
    @Column(name = "DESC_DENOMINAZIONE_STATO_ESTERO")
    private String denominazioneStatoEstero;
    @OneToMany(mappedBy = "statoEsteroNascita")
    private List<SoggettoFisico> soggettiFisici;
}

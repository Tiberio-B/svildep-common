package it.sogei.svildep.entity.gestionemandati;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionedocumenti.Fascicolo;
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
@Table(name = "D_MANDATI")
public class Mandato extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_MANDATO")
    private Long id;
    @OneToMany(mappedBy = "mandato")
    private List<Fascicolo> fascicoli;

}
//TODO: da completare

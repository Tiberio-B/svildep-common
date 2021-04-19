package it.sogei.svildep.entity.gestionepignoramenti;

import it.sogei.svildep.entity.base.BaseEntity;
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
@Table(name = "D_PIGNORAMENTI")
public class Pignoramento extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_PIGNORAMENTO")
    private Long id;
    @Column(name = "DATA_NOTIFICA_PIGNORAMENTO")
    private LocalDate dataNotificaPignoramento;
    @OneToMany(mappedBy = "pignoramento")
    private List<Fascicolo> fascicoli;
}

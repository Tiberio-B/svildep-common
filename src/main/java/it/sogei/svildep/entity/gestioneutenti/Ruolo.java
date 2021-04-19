package it.sogei.svildep.entity.gestioneutenti;

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
@Table(name = "D_RUOLI")
public class Ruolo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_RUOLO")
    private Long id;
    @Column(name = "DESC_RUOLO")
    private String ruolo;
    @OneToMany(mappedBy = "ruolo")
    private List<Utente> utenti;
}

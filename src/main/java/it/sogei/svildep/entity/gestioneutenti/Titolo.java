package it.sogei.svildep.entity.gestioneutenti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagTitolo;
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
@Table(name = "D_TITOLI")
public class Titolo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TITOLO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TITOLO")
    private String descrizione;
    @Column(name = "CODI_CODICE_TITOLO")
    private FlagTitolo codice;
    @OneToMany(mappedBy = "titolo")
    private List<Utente> utenti;
}

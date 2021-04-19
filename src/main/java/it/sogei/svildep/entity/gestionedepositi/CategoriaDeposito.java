package it.sogei.svildep.entity.gestionedepositi;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagCategoriaDeposito;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "D_CATEGORIE_DEPOSITO")
public class CategoriaDeposito extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_CATEGORIA_DEPOSITO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_CATEGORIA_DEPOSITO")
    private String descrizioneCategoriaDeposito;
    @Column(name = "CODI_CODICE_CATEGORIA_DEPOSITO")
    @Enumerated(EnumType.STRING)
    private FlagCategoriaDeposito codiceCategoria;
    @OneToMany(mappedBy = "categoriaDeposito")
    private List<Istanza> istanze;
    @OneToMany(mappedBy = "categoriaDeposito")
    private List<Deposito> depositi;
}

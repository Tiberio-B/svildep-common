package it.sogei.svildep.entity.gestionemodalitapagamento;

import it.sogei.svildep.entity.base.BaseEntity;
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
@Table(name = "D_TIPI_MODALITA_PAGAMENTO")
public class TipoModalitaPagamento extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_MODALITA_PAGAMENTO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_MODALITA_PAGAMENTO")
    private String descrizioneModalitaPagamento;
}

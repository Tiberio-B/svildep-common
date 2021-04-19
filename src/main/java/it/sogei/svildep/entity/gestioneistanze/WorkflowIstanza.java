package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionedepositi.Deposito;
import it.sogei.svildep.entity.gestioneutenti.Utente;
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
@Table(name = "D_WORKFLOW_ISTANZA")
public class WorkflowIstanza extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_WORKFLOW_ISTANZA")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "FK1_STATI_ISTANZE_WORKFLOW_ISTANZA")
    private StatoIstanza statoIstanza;
    @ManyToOne
    @JoinColumn(name = "FK1_UTENTI_WORKFLOW_ISTANZA")
    private Utente utente;
    @ManyToOne
    @JoinColumn(name = "FK1_ISTANZA_WORKFLOW_ISTANZA")
    private Deposito deposito;
}

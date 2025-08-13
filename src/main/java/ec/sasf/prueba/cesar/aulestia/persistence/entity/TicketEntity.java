package ec.sasf.prueba.cesar.aulestia.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tickets")
@Getter
@Setter
@NoArgsConstructor
public class TicketEntity extends Auditoria{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Long ticketId;

    private String descripcion;

    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "tecnico_id")
    private Long tecnicoId;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id", insertable = false, updatable = false)
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id", referencedColumnName = "tecnico_id", insertable = false, updatable = false)
    private PersonalTecnicoEntity tecnico;
    
}

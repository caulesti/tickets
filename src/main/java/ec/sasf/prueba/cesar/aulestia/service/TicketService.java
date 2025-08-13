package ec.sasf.prueba.cesar.aulestia.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.ClienteEntity;
import ec.sasf.prueba.cesar.aulestia.persistence.entity.TicketEntity;
import ec.sasf.prueba.cesar.aulestia.persistence.repository.ClienteRepository;
import ec.sasf.prueba.cesar.aulestia.persistence.repository.TicketRepository;
import ec.sasf.prueba.cesar.aulestia.service.dto.TicketDto;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    private final ClienteRepository clienteRepository;

    public TicketService(TicketRepository ticketRepository, ClienteRepository clienteRepository) {
        this.ticketRepository = ticketRepository;
        this.clienteRepository = clienteRepository;
    }

    public TicketEntity add(TicketDto dto) {
        TicketEntity ticket = new TicketEntity();
        ticket.setDescripcion(dto.getDescripcion());
        
        ClienteEntity cliente = clienteRepository.findById(dto.getClienteId()).orElseThrow(() -> new IllegalArgumentException("El cliente no existe"));
        ticket.setClienteId(cliente.getClienteId());
        ticket.setCliente(cliente);

        ticket.setTecnicoId(null);
        ticket.setFeCreacion(new Date());
        ticket.setFechaActualizacion(null);
        ticket.setEstado("PENDIENTE");
        return ticketRepository.save(ticket);
    }

}

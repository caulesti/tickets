package ec.sasf.prueba.cesar.aulestia.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.FacturaEntity;
import ec.sasf.prueba.cesar.aulestia.persistence.entity.PersonalTecnicoEntity;
import ec.sasf.prueba.cesar.aulestia.persistence.entity.TicketEntity;
import ec.sasf.prueba.cesar.aulestia.persistence.repository.FacturaRepository;
import ec.sasf.prueba.cesar.aulestia.persistence.repository.PersonalTecnicoRepository;
import ec.sasf.prueba.cesar.aulestia.persistence.repository.TicketRepository;
import ec.sasf.prueba.cesar.aulestia.service.dto.FacturaDto;
import jakarta.transaction.Transactional;

@Service
public class FacturaService {
    private final FacturaRepository facturaRepository;
    private final TicketRepository ticketRepository;
    private final PersonalTecnicoRepository personalTecnicoRepository;

    public FacturaService(FacturaRepository facturaRepository, TicketRepository ticketRepository, PersonalTecnicoRepository personalTecnicoRepository) {
        this.facturaRepository = facturaRepository;
        this.ticketRepository = ticketRepository;
        this.personalTecnicoRepository = personalTecnicoRepository;
    }

    @Transactional
    public FacturaEntity add(FacturaDto dto) {
        FacturaEntity factura = new FacturaEntity();
        factura.setMontoTotal(dto.getMontoTotal());
        TicketEntity ticket = ticketRepository.findById(dto.getTicketId()).orElseThrow(() -> new IllegalArgumentException("Ticket no encontrado"));
        factura.setTicketId(dto.getTicketId());
        factura.setTicket(ticket);
        PersonalTecnicoEntity tecnico = personalTecnicoRepository.findById(dto.getTecnicoId()).orElseThrow(() -> new IllegalArgumentException("No se encontro el tecnico"));
        ticket.setTecnicoId(dto.getTecnicoId());
        ticket.setTecnico(tecnico);
        ticket.setEstado("SOLUCIONADO");
        ticket.setFechaActualizacion(new Date());
        factura.setFeCreacion(new Date());
        factura.setFechaActualizacion(null);
        factura.setEstado("POR COBRAR");
        return facturaRepository.save(factura);
    }

}

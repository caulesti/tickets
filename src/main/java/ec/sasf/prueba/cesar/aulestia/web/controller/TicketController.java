package ec.sasf.prueba.cesar.aulestia.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.TicketEntity;
import ec.sasf.prueba.cesar.aulestia.service.TicketService;
import ec.sasf.prueba.cesar.aulestia.service.dto.TicketDto;

@RestController
@RequestMapping("/tickets")
@CrossOrigin("*")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public ResponseEntity<TicketEntity> add(@RequestBody TicketDto dto){
        return ResponseEntity.ok(ticketService.add(dto));
    }

}

package ec.sasf.prueba.cesar.aulestia.web.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.ClienteEntity;
import ec.sasf.prueba.cesar.aulestia.service.ClienteService;
import ec.sasf.prueba.cesar.aulestia.service.dto.ClienteDto;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<ClienteEntity> add(@RequestBody ClienteDto dto) {
        return ResponseEntity.ok(clienteService.add(dto));
    }

}

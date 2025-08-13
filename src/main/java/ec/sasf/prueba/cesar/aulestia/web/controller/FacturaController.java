package ec.sasf.prueba.cesar.aulestia.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.FacturaEntity;
import ec.sasf.prueba.cesar.aulestia.service.FacturaService;
import ec.sasf.prueba.cesar.aulestia.service.dto.FacturaDto;

@RestController
@RequestMapping("/facturas")
@CrossOrigin("*")
public class FacturaController {
    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @PostMapping
    public ResponseEntity<FacturaEntity> add(FacturaDto dto) {
        return ResponseEntity.ok(facturaService.add(dto));
    }

}

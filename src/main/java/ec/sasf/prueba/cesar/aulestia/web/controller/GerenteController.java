package ec.sasf.prueba.cesar.aulestia.web.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.GerenteEntity;
import ec.sasf.prueba.cesar.aulestia.service.GerenteService;
import ec.sasf.prueba.cesar.aulestia.service.dto.GerenteDto;

@RestController
@RequestMapping("/gerentes")
@CrossOrigin("*")
public class GerenteController {
    private final GerenteService gerenteService;

    public GerenteController(GerenteService gerenteService) {
        this.gerenteService = gerenteService;
    }

    @PostMapping
    public ResponseEntity<GerenteEntity> add(@RequestBody GerenteDto dto) {
        return ResponseEntity.ok(gerenteService.add(dto));
    }

}

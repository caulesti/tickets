package ec.sasf.prueba.cesar.aulestia.web.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.PersonalTecnicoEntity;
import ec.sasf.prueba.cesar.aulestia.service.PersonalTecnicoService;
import ec.sasf.prueba.cesar.aulestia.service.dto.PersonalTecnicoDto;

@RestController
@RequestMapping("/tecnicos")
@CrossOrigin("*")
public class PersonalTecnicoController {
    private final PersonalTecnicoService personalTecnicoService;

    public PersonalTecnicoController(PersonalTecnicoService personalTecnicoService) {
        this.personalTecnicoService = personalTecnicoService;
    }

    @PostMapping
    public ResponseEntity<PersonalTecnicoEntity> add(@RequestBody PersonalTecnicoDto dto) {
        return ResponseEntity.ok(personalTecnicoService.add(dto));
    }

}

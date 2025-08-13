package ec.sasf.prueba.cesar.aulestia.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.PersonalTecnicoEntity;
import ec.sasf.prueba.cesar.aulestia.persistence.repository.PersonalTecnicoRepository;
import ec.sasf.prueba.cesar.aulestia.service.dto.PersonalTecnicoDto;

@Service
public class PersonalTecnicoService {
    private final PersonalTecnicoRepository personalTecnicoRepository;

    public PersonalTecnicoService(PersonalTecnicoRepository personalTecnicoRepository) {
        this.personalTecnicoRepository = personalTecnicoRepository;
    }

    public PersonalTecnicoEntity add(PersonalTecnicoDto dto) {
        PersonalTecnicoEntity tecnico = new PersonalTecnicoEntity();
        tecnico.setNombre(dto.getNombre());
        tecnico.setEmail(dto.getEmail());
        tecnico.setFeCreacion(new Date());
        tecnico.setFechaActualizacion(null);
        tecnico.setEstado("ACTIVO");
        return personalTecnicoRepository.save(tecnico);
    }

    
}

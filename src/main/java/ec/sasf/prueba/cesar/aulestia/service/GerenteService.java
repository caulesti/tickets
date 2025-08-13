package ec.sasf.prueba.cesar.aulestia.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.GerenteEntity;
import ec.sasf.prueba.cesar.aulestia.persistence.repository.EntidadRepository;
import ec.sasf.prueba.cesar.aulestia.persistence.repository.GerenteRepository;
import ec.sasf.prueba.cesar.aulestia.service.dto.GerenteDto;

@Service
public class GerenteService {
    private final GerenteRepository gerenteRepository;

    public GerenteService(GerenteRepository gerenteRepository) {
        this.gerenteRepository = gerenteRepository;
    }

    public GerenteEntity add(GerenteDto dto) {
        GerenteEntity gerente = new GerenteEntity();
        gerente.setNombre(dto.getNombre());
        gerente.setEmail(dto.getEmail());
        gerente.setFeCreacion(new Date());
        gerente.setFechaActualizacion(null);
        gerente.setEstado("ACTIVO");
        return gerenteRepository.save(gerente);
    }
}

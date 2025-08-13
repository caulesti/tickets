package ec.sasf.prueba.cesar.aulestia.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.ClienteEntity;
import ec.sasf.prueba.cesar.aulestia.persistence.repository.ClienteRepository;
import ec.sasf.prueba.cesar.aulestia.service.dto.ClienteDto;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteEntity add(ClienteDto dto) {
        ClienteEntity cliente = new ClienteEntity();
        cliente.setNombre(dto.getNombre());
        cliente.setEmail(dto.getEmail());
        cliente.setFeCreacion(new Date());
        cliente.setFechaActualizacion(null);
        cliente.setEstado("ACTIVO");
        return clienteRepository.save(cliente);
    }

}

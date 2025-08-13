package ec.sasf.prueba.cesar.aulestia.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.EntidadEntity;

public interface EntidadRepository extends JpaRepository<EntidadEntity, Long> {

}

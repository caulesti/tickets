package ec.sasf.prueba.cesar.aulestia.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.sasf.prueba.cesar.aulestia.persistence.entity.FacturaEntity;

public interface FacturaRepository extends JpaRepository<FacturaEntity, Long> {

}

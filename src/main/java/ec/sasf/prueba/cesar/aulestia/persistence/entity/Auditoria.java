package ec.sasf.prueba.cesar.aulestia.persistence.entity;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class Auditoria {
    private Date feCreacion;
    private Date fechaActualizacion;
    private String estado;
}

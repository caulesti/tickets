package ec.sasf.prueba.cesar.aulestia.service.dto;

import lombok.Data;

@Data
public class TicketDto {
    private String descripcion;
    private Long clienteId;
    private String estado;

}

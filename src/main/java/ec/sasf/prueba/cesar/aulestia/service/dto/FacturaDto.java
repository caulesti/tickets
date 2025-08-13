package ec.sasf.prueba.cesar.aulestia.service.dto;

import java.util.Date;

import lombok.Data;

@Data
public class FacturaDto {
    private Double montoTotal;
    private Long ticketId;
    private Long tecnicoId;
}

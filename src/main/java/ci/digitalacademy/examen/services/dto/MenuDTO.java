package ci.digitalacademy.examen.services.dto;

import ci.digitalacademy.examen.models.Plat;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
public class MenuDTO {

    private Long id;

    private Date creation_date;

    private Plat plat;

}

package ci.digitalacademy.examen.services.dto;

import ci.digitalacademy.examen.models.Menu;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatDTO {

    private Long id;

    private String name;

    private String summary;

    private Menu menu;

}

package ci.digitalacademy.examen.services.mapper;

import ci.digitalacademy.examen.models.Plat;
import ci.digitalacademy.examen.services.dto.PlatDTO;

public class PlatMapper {

    private PlatMapper(){}


    public static PlatDTO toDto(Plat plat) {
        PlatDTO platDTO = new PlatDTO();
        platDTO.setId(plat.getId());
        platDTO.setName(plat.getName());
        platDTO.setSummary(plat.getSummary());
        platDTO.setMenu(plat.getMenu());

        return platDTO;
    }

    public static Plat toEntity(PlatDTO platDTO) {
        Plat plat = new Plat();

        plat.setId(platDTO.getId());
        plat.setName(platDTO.getName());
        plat.setSummary(platDTO.getSummary());
        plat.setMenu(platDTO.getMenu());

        return plat;
    }
    
}

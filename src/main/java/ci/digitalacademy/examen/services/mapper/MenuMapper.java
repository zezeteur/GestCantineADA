package ci.digitalacademy.examen.services.mapper;

import ci.digitalacademy.examen.models.Menu;
import ci.digitalacademy.examen.services.dto.MenuDTO;

public class MenuMapper {

    private MenuMapper(){}
    

    public static MenuDTO toDto(Menu menu) {
        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setId(menu.getId());
        menuDTO.setCreation_date(menu.getCreation_date());
        menuDTO.setPlat(menu.getPlat());
       
        return menuDTO;
    }

    public static Menu toEntity(MenuDTO menuDTO) {
        Menu menu = new Menu();

        menu.setId(menuDTO.getId());
        menu.setCreation_date(menuDTO.getCreation_date());
        menu.setPlat(menuDTO.getPlat());

        return menu;
    }

}

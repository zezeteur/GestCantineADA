package ci.digitalacademy.examen.services;

import ci.digitalacademy.examen.services.dto.MenuDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {

    MenuDTO save(MenuDTO menu);

    MenuDTO update(MenuDTO menu);

    Optional<MenuDTO> findOne(Long id);

    List<MenuDTO> findAll();

    void delete(Long id);

}

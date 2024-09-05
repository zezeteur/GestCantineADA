package ci.digitalacademy.examen.services.impl;

import ci.digitalacademy.examen.services.MenuService;
import ci.digitalacademy.examen.services.dto.MenuDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class MenuServiceImpl implements MenuService {


    @Override
    public MenuDTO save(MenuDTO menu) {
        return null;
    }

    @Override
    public MenuDTO update(MenuDTO menu) {
        return null;
    }

    @Override
    public Optional<MenuDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<MenuDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}

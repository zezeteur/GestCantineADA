package ci.digitalacademy.examen.services.impl;

import ci.digitalacademy.examen.services.PlatService;
import ci.digitalacademy.examen.services.dto.PlatDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PlatServiceImpl implements PlatService {


    @Override
    public PlatDTO save(PlatDTO plat) {
        return null;
    }

    @Override
    public PlatDTO update(PlatDTO plat) {
        return null;
    }

    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PlatDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}

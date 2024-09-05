package ci.digitalacademy.examen.services;

import ci.digitalacademy.examen.services.dto.PlatDTO;
import java.util.List;
import java.util.Optional;

public interface PlatService {

    PlatDTO save(PlatDTO plat);

    PlatDTO update(PlatDTO plat);

    Optional<PlatDTO> findOne(Long id);

    List<PlatDTO> findAll();

    void delete(Long id);

}

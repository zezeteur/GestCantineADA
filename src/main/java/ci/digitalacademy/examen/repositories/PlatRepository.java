package ci.digitalacademy.examen.repositories;

import ci.digitalacademy.examen.models.Plat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatRepository extends JpaRepository<Plat, Long> {
}

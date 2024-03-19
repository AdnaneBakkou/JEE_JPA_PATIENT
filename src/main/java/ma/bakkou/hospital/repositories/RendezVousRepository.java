package ma.bakkou.hospital.repositories;

import ma.bakkou.hospital.entities.Consultation;
import ma.bakkou.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}

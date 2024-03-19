package ma.bakkou.hospital.repositories;

import ma.bakkou.hospital.entities.Consultation;
import ma.bakkou.hospital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}

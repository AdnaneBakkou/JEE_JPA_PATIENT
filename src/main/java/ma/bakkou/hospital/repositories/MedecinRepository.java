package ma.bakkou.hospital.repositories;

import ma.bakkou.hospital.entities.Medecin;
import ma.bakkou.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
Medecin findByNom(String nom);
}

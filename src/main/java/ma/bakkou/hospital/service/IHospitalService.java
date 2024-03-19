package ma.bakkou.hospital.service;

import ma.bakkou.hospital.entities.Consultation;
import ma.bakkou.hospital.entities.Medecin;
import ma.bakkou.hospital.entities.Patient;
import ma.bakkou.hospital.entities.RendezVous;

public interface IHospitalService {
     Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}

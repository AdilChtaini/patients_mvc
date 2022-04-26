package ma.enset.patients_mvc.repositories;

import ma.enset.patients_mvc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
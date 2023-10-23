package miu.edu.Dental_Surgeries_AppSystem_WebApi.repository;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}

package miu.edu.Dental_Surgeries_AppSystem_WebApi.repository;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {
}

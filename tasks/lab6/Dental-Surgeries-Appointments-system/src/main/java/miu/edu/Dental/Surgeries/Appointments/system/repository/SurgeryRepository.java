package miu.edu.Dental.Surgeries.Appointments.system.repository;

import miu.edu.Dental.Surgeries.Appointments.system.models.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long> {
}

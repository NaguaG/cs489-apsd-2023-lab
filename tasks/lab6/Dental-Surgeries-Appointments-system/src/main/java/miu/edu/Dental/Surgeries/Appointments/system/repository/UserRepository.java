package miu.edu.Dental.Surgeries.Appointments.system.repository;

import miu.edu.Dental.Surgeries.Appointments.system.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

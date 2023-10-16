package miu.edu.Dental.Surgeries.Appointments.system.repository;

import miu.edu.Dental.Surgeries.Appointments.system.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User, Long> {
}

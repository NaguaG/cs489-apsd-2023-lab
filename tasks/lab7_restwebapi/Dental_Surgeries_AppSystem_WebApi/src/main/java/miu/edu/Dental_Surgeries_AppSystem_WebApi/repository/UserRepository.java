package miu.edu.Dental_Surgeries_AppSystem_WebApi.repository;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUserName(String userName);
}

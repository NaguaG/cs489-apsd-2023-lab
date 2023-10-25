package miu.edu.Dental_Surgeries_AppSystem_WebApi.repository;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findRoleByRoleName(String roleName);
}

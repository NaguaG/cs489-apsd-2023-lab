package miu.edu.Dental.Surgeries.Appointments.system.service;

import miu.edu.Dental.Surgeries.Appointments.system.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(Long roleId);
    Role updateRole(Role role);
    void deleteRole(Role role);
    Role addNewRole(Role role);
}

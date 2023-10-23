package miu.edu.Dental_Surgeries_AppSystem_WebApi.service;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(Long roleId);
    Role updateRole(Role role);
    void deleteRole(Role role);
    Role addNewRole(Role role);
}

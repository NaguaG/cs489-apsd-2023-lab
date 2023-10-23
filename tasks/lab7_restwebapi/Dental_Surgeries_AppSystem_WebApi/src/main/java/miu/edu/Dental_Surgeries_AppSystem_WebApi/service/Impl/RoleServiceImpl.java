package miu.edu.Dental_Surgeries_AppSystem_WebApi.service.Impl;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Role;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.repository.RoleRepository;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;
    public RoleServiceImpl(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }
    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(Long roleId) {
        return roleRepository.findById(roleId)
                .orElse(null);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(Role role) {
        roleRepository.delete(role);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }
}

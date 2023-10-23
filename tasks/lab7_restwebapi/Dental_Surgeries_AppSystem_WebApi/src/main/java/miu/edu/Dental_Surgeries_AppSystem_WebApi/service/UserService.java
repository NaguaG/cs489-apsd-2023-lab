package miu.edu.Dental_Surgeries_AppSystem_WebApi.service;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(Long userId);
    public User updateUser(User user);
    public void deleteUser(User user);
    public User addNewUser(User user);
}

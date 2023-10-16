package miu.edu.Dental.Surgeries.Appointments.system.service;

import miu.edu.Dental.Surgeries.Appointments.system.models.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(Long userId);
    public User updateUser(User user);
    public void deleteUser(User user);
    public User addNewUser(User user);
}

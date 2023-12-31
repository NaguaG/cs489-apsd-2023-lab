package miu.edu.Dental.Surgeries.Appointments.system.service.Impl;

import miu.edu.Dental.Surgeries.Appointments.system.models.User;
import miu.edu.Dental.Surgeries.Appointments.system.repository.UserRepository;
import miu.edu.Dental.Surgeries.Appointments.system.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElse(null);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);

    }

    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }
}

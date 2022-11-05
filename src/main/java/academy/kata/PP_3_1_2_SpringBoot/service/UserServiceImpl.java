package academy.kata.PP_3_1_2_SpringBoot.service;

import academy.kata.PP_3_1_2_SpringBoot.model.User;
import academy.kata.PP_3_1_2_SpringBoot.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void removeUser(User userToDelete) {
        userRepository.delete(userToDelete);
    }

    @Override
    @Transactional
    public void updateUser(User updatedUser) {
        userRepository.save(updatedUser);
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void cleanUsersTable() {
        userRepository.deleteAllInBatch();
    }

}

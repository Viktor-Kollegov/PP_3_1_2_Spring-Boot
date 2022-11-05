package academy.kata.PP_3_1_2_SpringBoot.service;

import academy.kata.PP_3_1_2_SpringBoot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(User user);

    void removeUser(User userToDelete);

    void updateUser(User updatedUser);

    Optional<User> findUserById(Long id);

    List<User> getAllUsers();

    void cleanUsersTable();

}

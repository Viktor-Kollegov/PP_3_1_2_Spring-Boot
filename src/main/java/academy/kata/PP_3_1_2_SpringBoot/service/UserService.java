package academy.kata.PP_3_1_2_SpringBoot.service;

import academy.kata.PP_3_1_2_SpringBoot.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {

    void saveUser(User user);

    void removeUser(User userToDelete);

    void updateUser(User updatedUser);

    User findUserById(int id);

    List<User> getAllUsers() throws SQLException;

    void cleanUsersTable() throws SQLException;

}

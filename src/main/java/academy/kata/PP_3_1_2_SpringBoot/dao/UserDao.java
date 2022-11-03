package academy.kata.PP_3_1_2_SpringBoot.dao;

import academy.kata.PP_3_1_2_SpringBoot.model.User;

import java.sql.SQLException;
import java.util.List;

//Можно так
//public interface UserDao extends JpaRepository<User, Long>{
// Пустое тело, все методы уже есть в родителе
//}

public interface UserDao {

    void saveUser(User user) throws SQLException;

    void removeUser(User userToDelete) throws SQLException;

    void updateUser(User updatedUser);

    User findUserById(int id);

    List<User> getAllUsers() throws SQLException;

    void cleanUsersTable() throws SQLException;


}

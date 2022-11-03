package academy.kata.PP_3_1_2_SpringBoot.service;

import academy.kata.PP_3_1_2_SpringBoot.dao.UserDaoJPAImpl;
import academy.kata.PP_3_1_2_SpringBoot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserDaoJPAImpl userDaoJPA;

    public UserServiceImpl(UserDaoJPAImpl userDaoJPA) {
        this.userDaoJPA = userDaoJPA;
    }

    @Transactional
    public void saveUser(User user) {
        userDaoJPA.saveUser(user);
    }
    @Transactional
    public void removeUser(User userToDelete) {
        userDaoJPA.removeUser(userToDelete);
    }

    @Override
    @Transactional
    public void updateUser(User updatedUser) {
        userDaoJPA.updateUser(updatedUser);
    }

    @Override
    @Transactional
    public User findUserById(int id) {
        return userDaoJPA.findUserById(id);
    }
    @Transactional
    public List<User> getAllUsers() {
        return userDaoJPA.getAllUsers();
    }
    @Transactional
    public void cleanUsersTable() {
        userDaoJPA.cleanUsersTable();
    }

}

package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    void updateUser(User user);

    void deleteUserById(int id);
}

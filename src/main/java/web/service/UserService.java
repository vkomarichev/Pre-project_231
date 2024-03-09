package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User getUser(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}

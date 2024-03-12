package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User getUser(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}

package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> index();
    User getUser(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}

package spring.train.dao;

import java.util.List;
import spring.train.model.User;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}

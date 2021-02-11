package spring.train.dao;

import java.util.List;
import java.util.Optional;
import spring.train.model.User;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    Optional<User> get(Long userId);
}

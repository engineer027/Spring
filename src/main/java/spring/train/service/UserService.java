package spring.train.service;

import java.util.List;
import spring.train.model.User;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User get(Long userId);
}

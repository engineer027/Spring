package spring.train.service;

import spring.train.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();
}

package spring.train.service;

import java.util.List;
import org.springframework.stereotype.Service;
import spring.train.dao.UserDao;
import spring.train.model.User;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}

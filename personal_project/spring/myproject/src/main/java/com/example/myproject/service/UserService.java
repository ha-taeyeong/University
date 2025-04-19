package com.example.myproject.service;

import com.example.myproject.dao.UserDao;
import com.example.myproject.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int createUser(User user) {
        return userDao.insertUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    public User getUser(int id) {
        return userDao.selectUser(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}

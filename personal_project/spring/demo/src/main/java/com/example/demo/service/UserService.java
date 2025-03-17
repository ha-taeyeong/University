package com.example.demo.service;

import com.example.demo.dto.User;
import com.example.demo.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public int addUser(String name, int age) {
        return userDAO.insertUser(name, age);
    }

    public int updateUser(int id, String name, int age) {
        return userDAO.updateUser(id, name, age);
    }

    public int removeUser(int id) {
        return userDAO.deleteUser(id);
    }

    public List<User> getAllUsers() {
        return userDAO.selectAllUsers();
    }

    public User getUserById(int id) {
        return userDAO.selectUserById(id);
    }
}




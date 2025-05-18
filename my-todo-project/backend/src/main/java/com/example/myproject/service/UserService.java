package com.example.myproject.service;

import com.example.myproject.dao.UserDao;
import com.example.myproject.model.User;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getUser(int userNo) {
        return userDao.selectUser(userNo);
    }

    public int createUser(User user, String regId, String regIp, String delYn) {
        user.setRegDt(new Date());
        user.setRegId(regId);
        user.setRegIp(regIp);
        user.setDelYn(delYn);
        return userDao.insertUser(user);
    }

    public int updateUser(User user, String modId, String modIp) {
        user.setModDt(new Date());
        user.setModId(modId);
        user.setModIp(modIp);
        return userDao.updateUser(user);
    }

    public int deleteUser(User user, String modId, String modIp, String delYn) {
        user.setModDt(new Date());
        user.setModId(modId);
        user.setModIp(modIp);
        user.setDelYn(delYn);
        return userDao.deleteUser(user);
    }

    public int deleteUserPermanently(int userNo) {
        return userDao.deleteUserPermanently(userNo);
    }

}

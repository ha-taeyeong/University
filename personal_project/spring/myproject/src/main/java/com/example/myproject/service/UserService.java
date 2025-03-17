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

    // 유저 추가
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    // 유저 업데이트
    public int updateUser(User user) {
        return userDao.updateUser(user);  // userDao에서 updateUser 메소드를 호출하여 영향을 받은 행의 개수를 반환
    }

    // 유저 삭제
    public int deleteUser(int id) {
        return userDao.deleteUser(id);  // userDao에서 deleteUser 메소드를 호출하여 영향을 받은 행의 개수를 반환
    }
    
    // 유저 조회
    public User getUser(int id) {
        return userDao.getUser(id);  // ID로 유저 조회
    }

    // 이름으로 유저 검색
    public List<User> getUsersByName(String name) {
        return userDao.getUsersByName(name);
    }

    // 이메일로 유저 검색
    public List<User> getUsersByEmail(String email) {
        return userDao.getUsersByEmail(email);
    }

    // 모든 유저 조회
    public List<User> getAllUsers() {
        return userDao.getAllUsers();  // 모든 유저 목록 조회
    }

}

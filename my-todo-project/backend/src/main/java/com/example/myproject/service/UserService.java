package com.example.myproject.service;

import com.example.myproject.dao.UserDao;
import com.example.myproject.dto.User;
import com.example.myproject.security.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public UserService(UserDao userDao, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

//    public User getUser(int userNo) {
//        return userDao.selectUser(userNo);
//    }

    public int createUser(User user, String regId, String regIp, String delYn) {
        user.setUserPw(passwordEncoder.encode(user.getUserPw())); // 암호화 적용
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

    public String login(String userId, String userPw) {
        User user = userDao.selectUserByUserId(userId);
        if (user == null) {
            throw new IllegalArgumentException("존재하지 않는 아이디입니다.");
        }
        if (!passwordEncoder.matches(userPw, user.getUserPw())) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        return jwtUtil.generateToken(userId);
    }

    public User findByUserId(String userId) {
        return userDao.selectUserByUserId(userId);
    }
}

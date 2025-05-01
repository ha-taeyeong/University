package com.example.myproject.dao;

import com.example.myproject.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    private final JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insertUser(User user) {
        String sql = "INSERT INTO user (user_id, user_pw, user_name, user_email) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, user.getUserId(), user.getUserPw(), user.getUserName());
    }

    public int updateUser(User user) {
        String sql = "UPDATE user SET user_id = ?, user_pw = ?, user_name = ?, user_email = ? WHERE user_no = ?";
        return jdbcTemplate.update(sql, user.getUserId(), user.getUserPw(), user.getUserName(), user.getUserNo());
    }

    public int deleteUser(int userNo) {
        String sql = "DELETE FROM user WHERE user_no = ?";
        return jdbcTemplate.update(sql, userNo);
    }

    public User selectUser(int userNo) {
        String sql = "SELECT * FROM user WHERE user_no = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            User user = new User();
            user.setUserNo(rs.getInt("user_no"));
            user.setUserId(rs.getString("user_id"));
            user.setUserPw(rs.getString("user_pw"));
            user.setUserName(rs.getString("user_name"));
            return user;
        }, userNo);
    }

    public List<User> getAllUsers() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            User user = new User();
            user.setUserNo(rs.getInt("user_no"));
            user.setUserId(rs.getString("user_id"));
            user.setUserPw(rs.getString("user_pw"));
            user.setUserName(rs.getString("user_name"));
            return user;
        });
    }
}

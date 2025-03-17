package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 사용자 추가
    public int insertUser(String name, int age) {
        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
        return jdbcTemplate.update(sql, name, age);
    }

    // 사용자 수정
    public int updateUser(int id, String name, int age) {
        String sql = "UPDATE users SET name = ?, age = ? WHERE id = ?";
        return jdbcTemplate.update(sql, name, age, id);
    }

    // 사용자 삭제
    public int deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    // 모든 사용자 조회
    public List<User> selectAllUsers() {
        String sql = "SELECT * FROM users";
        List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                return user;
            }
        });

        // 로그 출력
        if (users.isEmpty()) {
            System.out.println("No users found in the database.");
        } else {
            System.out.println("Fetched users: " + users);
        }

        return users;
    }


    // 특정 사용자 조회
    public User selectUserById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                return user;
            }
        }, id);
    }
}



package com.example.myproject.dao;

import com.example.myproject.dto.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    private final JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> getAllUsers() {
        String sql = "SELECT * FROM todo_user";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            User user = new User();
            user.setUserNo(rs.getInt("user_no"));
            user.setUserId(rs.getString("user_id"));
            user.setUserPw(rs.getString("user_pw"));
            user.setUserName(rs.getString("user_name"));
            user.setUserBirth(rs.getString("user_birth"));
            user.setUserGender(rs.getString("user_gender"));
            user.setRegDt(rs.getDate("reg_dt"));
            user.setRegId(rs.getString("reg_id"));
            user.setRegIp(rs.getString("reg_ip"));
            user.setModDt(rs.getDate("mod_dt"));
            user.setModId(rs.getString("mod_id"));
            user.setModIp(rs.getString("mod_ip"));
            user.setDelYn(rs.getString("del_yn"));
            return user;
        });
    }

    public int insertUser(User user) {
        String sql = "INSERT INTO todo_user (user_id, user_pw, user_name, user_birth, user_gender, reg_dt, reg_id, reg_ip, del_yn) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
            user.getUserId(),
            user.getUserPw(),
            user.getUserName(),
            user.getUserBirth(),
            user.getUserGender(),
            user.getRegDt(),
            user.getRegId(),
            user.getRegIp(),
            user.getDelYn()
        );
    }

    public int updateUser(User user) {
        String sql = "UPDATE todo_user SET user_name = ?, user_birth = ?, user_gender = ?, mod_dt = ?, mod_id = ?, mod_ip = ? " +
                     "WHERE user_no = ?";
        return jdbcTemplate.update(sql,
            user.getUserName(),
            user.getUserBirth(),
            user.getUserGender(),
            user.getModDt(),
            user.getModId(),
            user.getModIp(),
            user.getUserNo()
        );
    }

    public int deleteUser(User user) {
        String sql = "UPDATE todo_user SET mod_dt = ?, mod_id = ?, mod_ip = ?, del_yn = ?" +
                "WHERE user_no = ?";
        return jdbcTemplate.update(sql,
            user.getModDt(),
            user.getModId(),
            user.getModIp(),
            user.getDelYn(),
            user.getUserNo()
        );
    }

    public int deleteUserPermanently(int userNo) {
        String sql = "DELETE FROM todo_user WHERE user_no = ?";
        return jdbcTemplate.update(sql, userNo);
    }

    public User selectUserByUserId(String userId) {
        String sql = "SELECT * FROM todo_user WHERE user_id = ?";
        List<User> users = jdbcTemplate.query(sql, (rs, rowNum) -> {
            User user = new User();
            user.setUserNo(rs.getInt("user_no"));
            user.setUserId(rs.getString("user_id"));
            user.setUserPw(rs.getString("user_pw"));
            user.setUserName(rs.getString("user_name"));
            user.setUserBirth(rs.getString("user_birth"));
            user.setUserGender(rs.getString("user_gender"));
            user.setRegDt(rs.getDate("reg_dt"));
            user.setRegId(rs.getString("reg_id"));
            user.setRegIp(rs.getString("reg_ip"));
            user.setModDt(rs.getDate("mod_dt"));
            user.setModId(rs.getString("mod_id"));
            user.setModIp(rs.getString("mod_ip"));
            user.setDelYn(rs.getString("del_yn"));
            return user;
        }, userId);
        return users.isEmpty() ? null : users.get(0); // 결과가 없으면 null 반환
    }

}

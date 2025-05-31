package com.example.myproject.dao;

import com.example.myproject.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Contact contact) {
        String sql = "INSERT INTO todo_contact (user_id, name, email, message) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                contact.getUserId(),
                contact.getName(),
                contact.getEmail(),
                contact.getMessage()
        );
    }
}

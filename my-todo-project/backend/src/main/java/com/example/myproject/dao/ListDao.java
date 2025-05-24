package com.example.myproject.dao;

import com.example.myproject.dto.ListDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ListDao {

    private final JdbcTemplate jdbcTemplate;

    public ListDao(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public List<ListDto> getAllList() {
        String sql = "SELECT * FROM todo_list";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            ListDto list = new ListDto();
            list.setListNo(rs.getInt(("list_no")));
            list.setUserNo(rs.getInt(("user_no")));
            list.setListName(rs.getString(("list_name")));
            list.setCompletedYn(rs.getString(("completed_yn")));
            list.setRegDt(rs.getDate("reg_dt"));
            list.setRegId(rs.getString("reg_id"));
            list.setRegIp(rs.getString("reg_ip"));
            list.setModDt(rs.getDate("mod_dt"));
            list.setModId(rs.getString("mod_id"));
            list.setModIp(rs.getString("mod_ip"));
            list.setDelYn(rs.getString("del_yn"));
            return list;
        });
    }
}

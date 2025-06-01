package com.example.myproject.dao;

import com.example.myproject.dto.ListDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ListDao {

    private final JdbcTemplate jdbcTemplate;

    public ListDao(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public List<ListDto> findByUserNo(Long userNo) {
        String sql = "SELECT * FROM todo_list WHERE user_no = ?";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            ListDto list = new ListDto();
            list.setListNo(rs.getInt("list_no"));
            list.setUserNo(rs.getInt("user_no"));
            list.setListName(rs.getString("list_name"));
            list.setCompletedYn(rs.getString("completed_yn"));
            list.setRegDt(rs.getDate("reg_dt"));
            list.setRegId(rs.getString("reg_id"));
            list.setRegIp(rs.getString("reg_ip"));
            list.setModDt(rs.getDate("mod_dt"));
            list.setModId(rs.getString("mod_id"));
            list.setModIp(rs.getString("mod_ip"));
            list.setDelYn(rs.getString("del_yn"));
            return list;
        }, userNo);
    }

    public int insertList(ListDto list) {
        String sql = "INSERT INTO todo_list (user_no, list_name, completed_yn, reg_dt, reg_id, reg_ip, del_yn) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                list.getUserNo(),
                list.getListName(),
                list.getCompletedYn(),
                list.getRegDt(),
                list.getRegId(),
                list.getRegIp(),
                list.getDelYn()
        );
    }

    public int updateList(ListDto list) {
        String sql = "UPDATE todo_list SET list_name = ?, completed_yn = ?, mod_dt = ?, mod_id = ?, mod_ip = ? " +
                     "WHERE list_no = ?";
        return jdbcTemplate.update(sql,
                list.getListName(),
                list.getCompletedYn(),
                list.getModDt(),
                list.getModId(),
                list.getModIp(),
                list.getListNo()
        );
    }

    public int deleteList(ListDto list) {
        String sql = "UPDATE todo_list SET mod_dt = ?, mod_id = ?, mod_ip = ?, del_yn = ?" +
                     "WHERE list_no = ?";
        return jdbcTemplate.update(sql,
                list.getModDt(),
                list.getModId(),
                list.getModIp(),
                list.getDelYn(),
                list.getListNo()
        );
    }

    public int deleteListPermanently(int listNo) {
        String sql = "DELETE FROM todo_list WHERE list_no = ?";
        return jdbcTemplate.update(sql, listNo);
    }

    public ListDto selectbyListNo(int listNo) {
        String sql = "SELECT * FROM todo_list WHERE list_no = ?";
        List<ListDto> lists = jdbcTemplate.query(sql, (rs, rowNum) -> {
            ListDto list = new ListDto();
            list.setUserNo(rs.getInt("user_no"));
            list.setListNo(rs.getInt("list_no"));
            list.setListName(rs.getString("list_name"));
            list.setCompletedYn(rs.getString("completed_yn"));
            list.setRegDt(rs.getDate("reg_dt"));
            list.setRegId(rs.getString("reg_id"));
            list.setRegIp(rs.getString("reg_ip"));
            list.setModDt(rs.getDate("mod_dt"));
            list.setModId(rs.getString("mod_id"));
            list.setModIp(rs.getString("mod_ip"));
            list.setDelYn(rs.getString("del_yn"));
            return list;
        }, listNo);
        return lists.isEmpty() ? null : lists.get(0); // 결과가 없으면 null 반환
    }

}

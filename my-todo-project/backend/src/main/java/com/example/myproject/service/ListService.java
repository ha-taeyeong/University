package com.example.myproject.service;

import com.example.myproject.dao.ListDao;
import com.example.myproject.dto.ListDto;
import com.example.myproject.dto.User;
import com.example.myproject.security.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class ListService {

    private final ListDao listDao;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public ListService(ListDao listDao, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.listDao = listDao;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public List<ListDto> getListByUserNo(Long userNo, LocalDate listDate) {
        if (listDate == null) {
            throw new IllegalArgumentException("listDate는 null일 수 없습니다.");
        }
        return listDao.findByUserNo(userNo, listDate);
    }

    public int createList(ListDto list, String completedYn, String regId, String regIp, String delYn) {
        list.setCompletedYn(completedYn);
        list.setRegDt(new Date());
        list.setRegId(regId);
        list.setRegIp(regIp);
        list.setDelYn(delYn);
        return listDao.insertList(list);
    }

    public int updateList(ListDto list, String modId, String modIp) {
        list.setModDt(new Date());
        list.setModId(modId);
        list.setModIp(modIp);
        return listDao.updateList(list);
    }

    public int deleteList(ListDto list, String modId, String modIp, String delYn) {
        list.setModDt(new Date());
        list.setModId(modId);
        list.setModIp(modIp);
        list.setDelYn(delYn);
        return listDao.deleteList(list);
    }

    public int deleteListPermanently(int listNo) {
        return listDao.deleteListPermanently(listNo);
    }

    public ListDto findByListNo(int listNo) {
        return listDao.selectbyListNo(listNo);
    }

}
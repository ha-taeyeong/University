package com.example.myproject.dto;

import java.time.LocalDate;
import java.util.Date;
import lombok.Data;

@Data
public class ListDto {
    private int listNo;
    private long userNo;
    private String listName;
    private String completedYn;
    private Date regDt;
    private String regId;
    private String regIp;
    private Date modDt;
    private String modId;
    private String modIp;
    private String delYn;
    private LocalDate listDate;
}
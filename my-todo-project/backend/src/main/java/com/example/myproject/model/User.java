package com.example.myproject.model;

import java.util.Date;
import lombok.Data;

@Data
public class User {
	private int userNo;
    private String userId;
    private String userPw;
    private String userName;
    private String userBirth;
    private String userGender;
    private Date regDt;
    private String regId;
    private String regIp;
    private Date modDt;
    private String modId;
    private String modIp;
    private String delYn;

}

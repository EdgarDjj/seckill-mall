package com.edgar.common.domain;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {
    private Long id;
    private Long userAccount;
    private String userNickname;
    private String userPassword;
    private String userEmail;
    private boolean isBan;
    private Date createTime;
    private Date updateTime;


}

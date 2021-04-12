package com.edgar.common.service;


import com.edgar.common.domain.UserInfo;

public interface UserService {
    /**
     *
     */
    UserInfo getUserByAccount(Long account);

}

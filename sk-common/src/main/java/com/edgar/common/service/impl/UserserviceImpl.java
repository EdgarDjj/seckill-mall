package com.edgar.common.service.impl;

import com.edgar.common.dao.UserDao;
import com.edgar.common.domain.UserInfo;
import com.edgar.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserserviceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserInfo getUserByAccount(Long account) {
        return userDao.getUserByAccount(account);
    }
}

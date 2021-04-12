package com.edgar.mall.dao;

import entity.User;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/4/12
 **/
public interface MallUserMapper {
    User getUserByLoginName(String loginName);

    void register(User user);

    void updateUserByPrimaryKey(User user);

    User selectUserById(Long userId);
}

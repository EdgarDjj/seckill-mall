package com.edgar.mall.service;

import entity.User;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/4/12
 **/
public interface MallUserCacheService {

    /**
     * 将手机号的验证码放入redis
     *
     * @param loginName
     * @param authCode
     */
    void setAuthCode(String loginName, String authCode);

    /**
     * 通过手机号获取验证码
     *
     * @param loginName
     * @return
     */
    String getAuthCode(String loginName);

    /**
     * 获取用户缓存
     *
     * @param loginName
     * @return
     */
    User getUser(String loginName);

    /**
     * 删除用户缓存
     *
     * @param loginName
     */
    void delUser(String loginName);

    /**
     * 添加用户
     *
     * @param user
     */
    void setUser(User user);
}

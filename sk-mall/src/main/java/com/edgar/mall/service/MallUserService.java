package com.edgar.mall.service;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/4/12
 **/
public interface MallUserService {
    /**
     * 生成验证码
     *
     * @param loginName
     * @return
     */
    String generateAuthCode(String loginName);

    /**
     * 校验验证码是否正确
     *
     * @param loginName
     * @param authCode
     * @return
     */
    boolean verifyAuthCode(String loginName, String authCode);

}

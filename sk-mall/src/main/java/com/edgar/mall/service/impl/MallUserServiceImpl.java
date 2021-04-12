package com.edgar.mall.service.impl;

import com.edgar.mall.dao.MallUserMapper;
import com.edgar.mall.service.MallUserCacheService;
import com.edgar.mall.service.MallUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/4/12
 **/
@Service
public class MallUserServiceImpl implements MallUserService {
    @Resource
    MallUserMapper mallUserMapper;
    @Resource
    MallUserCacheService mallUserCacheService;
    @Value("${authcode.num}")
    private String authcodeNum;

    @Override
    public String generateAuthCode(String loginName) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < Integer.parseInt(authcodeNum); i++) {
            stringBuilder.append(random.nextInt(10));
        }
        mallUserCacheService.setAuthCode(loginName, stringBuilder.toString());
        return stringBuilder.toString();
    }

    @Override
    public boolean verifyAuthCode(String loginName, String authCode) {
        String realAuthCode = mallUserCacheService.getAuthCode(loginName);
        return authCode.equals(realAuthCode);
    }
}

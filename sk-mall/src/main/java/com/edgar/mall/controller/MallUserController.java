package com.edgar.mall.controller;

import com.edgar.common.api.CommonResult;
import com.edgar.common.utils.NumberUtil;
import com.edgar.mall.service.MallUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/4/12
 **/
@Api(tags = "mall用户接口")
@RestController
@RequestMapping("/user")
public class MallUserController {
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Resource
    MallUserService mallUserService;

    @ApiOperation(value = "获取验证码")
    @GetMapping("/getAuthCode")
    public CommonResult getAuthCode(@RequestParam String loginName) {
        if (!NumberUtil.isPhone(loginName)) {
            return CommonResult.failed("请输入一个正确的手机号");
        }
        String authCode = mallUserService.generateAuthCode(loginName);
        return CommonResult.success(authCode, "获取验证码成功！");
    }

    @ApiOperation(value = "判断验证码是否正确")
    @GetMapping("/verifyAuthCode")
    public CommonResult verifyAuthCode(@RequestParam String loginName,
                                       @RequestParam String authCode) {
        if (StringUtils.isEmpty(loginName) || StringUtils.isEmpty(authCode)) {
            return CommonResult.failed("验证码和手机号不能为空");
        }
        if (mallUserService.verifyAuthCode(loginName, authCode)) {
            return CommonResult.success("验证成功");
        } else {
            return CommonResult.failed("验证失败");
        }
    }
}

package com.edgar.mall.controller.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/4/12
 **/
@Data
public class MallUserLoginParam {
    @NotEmpty
    @ApiModelProperty("登陆名")
    private String loginName;

    @NotEmpty
    @ApiModelProperty("登陆密码")
    private String loginPassword;
}

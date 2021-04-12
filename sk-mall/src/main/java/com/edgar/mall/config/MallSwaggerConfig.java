package com.edgar.mall.config;

import com.edgar.common.config.BaseSwaggerConfig;
import com.edgar.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description:
 * swagger
 *
 * @author:edgarding
 * @date:2021/4/12
 **/
@Configuration
@EnableSwagger2
public class MallSwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.edgar.mall.controller")
                .title("sk-mall系统")
                .description("sk-mall相关接口文档")
                .contactName("EdgarDing")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
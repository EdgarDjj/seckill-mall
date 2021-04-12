package com.edgar.mall.config;

import com.edgar.common.config.BaseRedisConfig;
import com.edgar.common.config.GlobalCorsConfig;
import com.edgar.common.service.RedisService;
import com.edgar.common.service.impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/4/11
 **/
@Configuration
public class MallGlobalCorsConfig extends GlobalCorsConfig {

}

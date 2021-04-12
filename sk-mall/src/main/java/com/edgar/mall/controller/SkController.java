package com.edgar.mall.controller;


import com.edgar.common.domain.SkProductInfo;
import com.edgar.common.key.SkProductKey;
import com.edgar.common.service.RedisService;
import com.edgar.common.service.SkProductService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class SkController implements InitializingBean {
    @Autowired
    SkProductService skProductService;
    @Autowired
    RedisService redisService;

    @Override
    public void afterPropertiesSet() throws Exception {
        List<SkProductInfo> skProductInfoList= skProductService.getListSkProduct();
        if(skProductInfoList==null){
            return ;
        }
        for(SkProductInfo sk: skProductInfoList){
            redisService.set(SkProductKey.SkProductStock.getPrefix()+sk.getName(),sk.getSkStock(),SkProductKey.SkProductStock.getExpireSeconds());
        }
    }
}

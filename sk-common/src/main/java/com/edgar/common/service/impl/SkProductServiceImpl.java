package com.edgar.common.service.impl;

import com.edgar.common.dao.SkProductDao;
import com.edgar.common.domain.SkProductInfo;
import com.edgar.common.key.SkProductKey;
import com.edgar.common.service.SkProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkProductServiceImpl implements SkProductService {

    @Autowired
    SkProductDao skProductDao;

    @Autowired
    RedisServiceImpl redisService;

    @Override
    public List<SkProductInfo> getListSkProduct() {
        return skProductDao.listSkProduct();
    }

    public boolean decr(SkProductInfo skProductInfo){

        boolean skEnd=(boolean)redisService.get(SkProductKey.SkProductEnd.getPrefix()+skProductInfo.getName());
        if(skEnd){
            return false;
        }
        int stock=getStock(skProductInfo);
        if(stock<=0){
            redisService.set(SkProductKey.SkProductEnd.getPrefix()+ skProductInfo.getName(),true);
            return false;
        }
        redisService.decr(SkProductKey.SkProductEnd.getPrefix()+ skProductInfo.getName(),1);
        return true;
    }
    public int getStock(SkProductInfo skProductInfo){
        return (int)redisService.get(SkProductKey.SkProductStock.getPrefix()+skProductInfo.getName());
    }
}

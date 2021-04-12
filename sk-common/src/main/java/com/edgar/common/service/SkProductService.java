package com.edgar.common.service;

import com.edgar.common.domain.SkProductInfo;

import java.util.List;

public interface SkProductService {

    /**
     * 获取全部秒杀商品信息
     */
    List<SkProductInfo> getListSkProduct();
}

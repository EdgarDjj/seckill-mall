package com.edgar.common.dao;

import com.edgar.common.domain.SkProductInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkProductDao {
    @Select("select * from sm_sekillproduct_info")
    List<SkProductInfo> listSkProduct();
}

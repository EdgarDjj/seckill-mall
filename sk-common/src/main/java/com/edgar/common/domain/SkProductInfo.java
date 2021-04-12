package com.edgar.common.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class SkProductInfo {
    private Long id;
    private Long productCategoryId;
    private Long tagId;
    private String productSn;
    private String name;
    private double skPrice;
    private double pskPrice;
    private Date startTime;
    private Date endTime;
    private Long skStock;
    private Date createTime;
    private Date updateTime;

}

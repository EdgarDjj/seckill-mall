package com.edgar.common.key;

import java.awt.image.Kernel;

public class SkProductKey extends RedisBaseKey{

    public static SkProductKey SkProductStock=new SkProductKey(30,"Sk_stock");
    public static SkProductKey SkProductDetail=new SkProductKey(30,"Sk_detail");
    public static SkProductKey SkProductList=new SkProductKey(30,"Sk_list");
    public static SkProductKey SkProductEnd=new SkProductKey(0,"Sk_end");

    public SkProductKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

}

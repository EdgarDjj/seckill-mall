package com.edgar.common.config;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于配置白名单资源路径
 */
@Getter
@Setter
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

}

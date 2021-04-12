package com.edgar.common.key;

public abstract class RedisBaseKey {
    private int expireSeconds;
    private String prefix;

    public RedisBaseKey(int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    public RedisBaseKey(String prefix){
        this.expireSeconds=0;
        this.prefix=prefix;
    }

    public String getPrefix() {
        return prefix+":";
    }
    public int getExpireSeconds(){
        return expireSeconds;
    }
}

package com.whyalwaysmea.core.properties;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:    验证码
 */
public class SmsCodeProperties {

    /**
     * 验证码长度
     */
    private int length = 6;

    /**
     * 过期时间
     */
    private int expireIn = 60;

    private String url;

    public int getLength() {
        return length;
    }
    public void setLength(int lenght) {
        this.length = lenght;
    }
    public int getExpireIn() {
        return expireIn;
    }
    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}

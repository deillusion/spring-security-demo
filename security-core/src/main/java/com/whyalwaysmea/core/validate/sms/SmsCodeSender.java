package com.whyalwaysmea.core.validate.sms;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:
 */
public interface SmsCodeSender {

    void send(String phone, String code);
}

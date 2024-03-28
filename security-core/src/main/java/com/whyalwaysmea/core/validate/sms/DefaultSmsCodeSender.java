package com.whyalwaysmea.core.validate.sms;

import org.springframework.stereotype.Component;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:    模拟短信发送
 */
public class DefaultSmsCodeSender implements SmsCodeSender {

    @Override
    public void send(String phone, String code) {
        System.out.println("向手机号：" + phone + "，发送验证码：" + code);
    }
}

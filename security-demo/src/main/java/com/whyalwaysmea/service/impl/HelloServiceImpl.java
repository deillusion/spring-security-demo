package com.whyalwaysmea.service.impl;

import com.whyalwaysmea.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String greeting(String name) {
        System.out.println("greeting");
        return "hello "+name;
    }

}

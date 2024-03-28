package com.whyalwaysmea.core.validate;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:
 */
public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String msg) {
        super(msg);
    }
}

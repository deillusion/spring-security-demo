package com.whyalwaysmea.core.validate;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:
 */
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);

}

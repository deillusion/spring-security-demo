package com.whyalwaysmea.core.authentication;

import com.whyalwaysmea.core.properties.SecurityConstants;
import com.whyalwaysmea.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:    默认的权限配置
 */
@Component
@Order(Integer.MIN_VALUE)
public class MyAuthorizeConfigProvider implements AuthorizeConfigProvider {

    @Autowired
    private SecurityProperties securityProperties;


    @Override
    public void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {
        config.antMatchers(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL,
                    SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_MOBILE,
                    securityProperties.getBrowser().getLoginPage(),
                    SecurityConstants.DEFAULT_VALIDATE_CODE_URL_PREFIX+"/*",
                    SecurityConstants.DEFAULT_SESSION_INVALID_URL)
                .permitAll();
    }
}

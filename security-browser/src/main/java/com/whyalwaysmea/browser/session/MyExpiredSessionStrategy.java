package com.whyalwaysmea.browser.session;


import java.io.IOException;

import javax.servlet.ServletException;

import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:    Session超时失效
 */
public class MyExpiredSessionStrategy extends AbstractSessionStrategy implements SessionInformationExpiredStrategy {

    public MyExpiredSessionStrategy(String invalidSessionUrl) {
        super(invalidSessionUrl);
    }

    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
        onSessionInvalid(event.getRequest(), event.getResponse());
    }

    @Override
    protected boolean isConcurrency() {
        return true;
    }
}

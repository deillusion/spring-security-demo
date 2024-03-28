package com.whyalwaysmea.core.dto;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:
 */
public class BaseResponse {

    public BaseResponse(Object content) {
        this.content = content;
    }

    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}

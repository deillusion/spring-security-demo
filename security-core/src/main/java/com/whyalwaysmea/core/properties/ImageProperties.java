package com.whyalwaysmea.core.properties;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:    图片验证码配置
 */
public class ImageProperties extends SmsCodeProperties{

    /**
     * 图片验证码默认长度为4
     */
    public ImageProperties() {setLength(4);}

    /**
     * 图片的宽
     */
    private int width = 60;

    /**
     * 图片的高
     */
    private int height = 40;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

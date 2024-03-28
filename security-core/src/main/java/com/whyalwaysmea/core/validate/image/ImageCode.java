package com.whyalwaysmea.core.validate.image;

import com.whyalwaysmea.core.validate.ValidateCode;
import org.apache.commons.lang.Validate;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * @Author: Dimo
 * @Date: Create in 2024/3/27 
 * @Description:
 */
public class ImageCode extends ValidateCode {

    private BufferedImage image;

    public ImageCode(BufferedImage image, String code, int expireId) {
        super(code, LocalDateTime.now().plusSeconds(expireId));
        this.image = image;
    }

    public ImageCode(BufferedImage image, String code, LocalDateTime localDateTime) {
        super(code, localDateTime);
        this.image = image;
    }


    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

}

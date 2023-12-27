package com.wang.service.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName BeanThree
 * @Description
 * @Author ww
 * @Time 2023/12/27 14:17
 */
public class BeanThree {

    private static final Logger LOGGER = LoggerFactory.getLogger(BeanTwo.class);

    public void beanThree() {
        LOGGER.info("BeanThree invoke");
    }
}

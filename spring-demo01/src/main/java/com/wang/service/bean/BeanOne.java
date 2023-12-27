package com.wang.service.bean;

import com.wang.service.DefaultServiceLocator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName BeanOne
 * @Description
 * @Author ww
 * @Time 2023/12/27 14:17
 */
public class BeanOne {

    private static final Logger LOGGER = LoggerFactory.getLogger(BeanOne.class);

    private BeanTwo beanTwo;

    private BeanThree beanThree;


    public BeanOne(BeanTwo beanTwo, BeanThree beanThree) {
        this.beanTwo = beanTwo;
        this.beanThree = beanThree;
    }

    public void beanOne() {
        LOGGER.info("BeanOne invoke");
        beanTwo.beanTwo();
        beanThree.beanThree();
    }

}

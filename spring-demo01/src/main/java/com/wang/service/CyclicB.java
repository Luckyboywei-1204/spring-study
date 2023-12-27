package com.wang.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName CyclicB
 * @Description
 * @Author ww
 * @Time 2023/12/27 22:12
 */
public class CyclicB {
    private static final Logger LOGGER = LoggerFactory.getLogger(CyclicB.class);

    private CyclicA cyclicA;

    // public CyclicB(CyclicA cyclicA) {
    //     this.cyclicA = cyclicA;
    // }

    // set注入解决循环依赖
    public CyclicB setCyclicA(CyclicA cyclicA) {
        this.cyclicA = cyclicA;
        return this;
    }

    public void cyclicB() {
        LOGGER.info("cyclicB invoke");
    }
}

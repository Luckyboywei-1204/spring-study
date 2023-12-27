package com.wang.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName CyclicA
 * @Description
 * @Author ww
 * @Time 2023/12/27 22:11
 */
public class CyclicA {
    private static final Logger LOGGER = LoggerFactory.getLogger(CyclicA.class);

    private CyclicB cyclicB;

    // public CyclicA(CyclicB cyclicB) {
    //     this.cyclicB = cyclicB;
    // }

    // set注入解决循环依赖
    public CyclicA setCyclicB(CyclicB cyclicB) {
        this.cyclicB = cyclicB;
        return this;
    }

    public void cyclicA() {
        LOGGER.info("cyclicA invoke");
    }
}

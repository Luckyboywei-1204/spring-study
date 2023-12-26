package com.wang.service;

import com.wang.service.ClientServer01;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName DefaultServiceLocator
 * @Description
 * @Author ww
 * @Time 2023/12/27 00:03
 */
public class DefaultServiceLocator {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultServiceLocator.class);

    private static ClientServer01 clientService01 = new ClientServer01();

    public ClientServer01 createClientServiceInstance() {
        return clientService01;
    }

    public void defaultServiceLocatorInvoke() {
        LOGGER.info("DefaultServiceLocator invoke");
        clientService01.invoke();
    }
}

package com.wang.service;

import com.wang.main.MainTest01;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName ClientService
 * @Description
 * @Author ww
 * @Time 2023/12/26 23:55
 */
public class ClientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientService.class);


    public static ClientService createInstance() {
        return new ClientService();
    }

    public void invoke() {
        LOGGER.info("ClientService invoke");
    }
}

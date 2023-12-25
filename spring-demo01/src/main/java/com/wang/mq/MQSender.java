package com.wang.mq;

import com.wang.dao.JpaAccountDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName MQSender
 * @Description
 * @Author ww
 * @Time 2023/12/25 20:58
 */
public class MQSender {

    private static final Logger LOGGER = LoggerFactory.getLogger(MQSender.class);


    public void sendMessage() {
        LOGGER.info("MQSender sendMessage");
    }
}

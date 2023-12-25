package com.wang.main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.wang.mq.MQSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MainTest02
 * @Description 测试多个xml聚合到一个xml中
 * @Author ww
 * @Time 2023/12/25 20:59
 */
public class MainTest02 {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainTest02.class);


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("MainTest02 test");
        MQSender mqSender = (MQSender) context.getBean("mqSender");
        mqSender.sendMessage();
    }
}

package com.wang.main;

import com.wang.service.PetStoreServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MainTest01
 * @Description 测试spring容器获取bean,以xml配置方式注入bean
 * @Author ww
 * @Time 2023/12/25 20:41
 */
public class MainTest01 {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainTest01.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("MainTest01.save start");
        context.getBean(PetStoreServiceImpl.class).save();
    }
}

package com.wang.service.bean;

import com.wang.dao.StoreDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName ExampleBean01
 * @Description
 * @Author ww
 * @Time 2023/12/28 23:40
 */
public class ExampleBean01 {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleBean01.class);

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void isNull() {
        if (email == null) {
            LOGGER.info("email is null");
        } else {
            LOGGER.info("email is not null");
        }
    }
}

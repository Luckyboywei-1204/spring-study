package com.wang.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName JpaAccountDao
 * @Description
 * @Author ww
 * @Time 2023/12/22 19:02
 */
public class JpaAccountDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(JpaAccountDao.class);


    public void save() {
        LOGGER.info("JpaAccountDao.save");
    }
}

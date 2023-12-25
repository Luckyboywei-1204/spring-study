package com.wang.dao;

import com.wang.main.MainTest01;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName JpaItemDao
 * @Description
 * @Author ww
 * @Time 2023/12/22 19:02
 */
public class JpaItemDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(JpaItemDao.class);

    public void save() {
        LOGGER.info("JpaItemDao.save");
    }

}

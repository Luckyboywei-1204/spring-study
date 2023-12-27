package com.wang.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName ParentDataSource
 * @Description
 * @Author ww
 * @Time 2023/12/27 23:11
 */
public class ParentDataSource {
    private static final Logger LOGGER = LoggerFactory.getLogger(ParentDataSource.class);

    private SonDataSource sonDataSource;

    public void setSonDataSource(SonDataSource sonDataSource) {
        this.sonDataSource = sonDataSource;
    }

    public void parentDataSource() {
        LOGGER.info("parentDataSource invoke");
        LOGGER.info(sonDataSource.toString());
    }
}

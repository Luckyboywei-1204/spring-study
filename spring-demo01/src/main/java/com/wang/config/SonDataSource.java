package com.wang.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SonDataSource
 * @Description
 * @Author ww
 * @Time 2023/12/27 23:15
 */
public class SonDataSource {
    private static final Logger LOGGER = LoggerFactory.getLogger(SonDataSource.class);


    private String driverClassName;

    private String url;

    private String username;

    private String password;

    public SonDataSource setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
        return this;
    }

    public SonDataSource setUrl(String url) {
        this.url = url;
        return this;
    }

    public SonDataSource setUsername(String username) {
        this.username = username;
        return this;
    }

    public SonDataSource setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "SonDataSource{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void close() {
        LOGGER.info("SonDataSource close");
    }
}

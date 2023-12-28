package com.wang.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName DataSource
 * @Description
 * @Author ww
 * @Time 2023/12/27 22:37
 */
public class DataSource {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataSource.class);


    private String driverClassName;

    private String url;

    private String username;

    private String password;

    public DataSource setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
        return this;
    }

    public DataSource setUrl(String url) {
        this.url = url;
        return this;
    }

    public DataSource setUsername(String username) {
        this.username = username;
        return this;
    }

    public DataSource setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void close() {
        LOGGER.info("DataSource close");
    }
}

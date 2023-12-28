package com.wang.dao;

import com.alibaba.fastjson.JSON;
import com.wang.config.DataSource;
import com.wang.config.ParentDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName StoreDao
 * @Description
 * @Author ww
 * @Time 2023/12/27 23:22
 */
public class StoreDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(StoreDao.class);


    private Properties adminEmails;

    private List<DataSource> someList;

    private Map<String, String> someMap;

    private Set<String> someSet;

    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;
    }

    public void setSomeList(List<DataSource> someList) {
        this.someList = someList;
    }

    public void setSomeMap(Map<String, String> someMap) {
        this.someMap = someMap;
    }

    public void setSomeSet(Set<String> someSet) {
        this.someSet = someSet;
    }

    public Properties getAdminEmails() {
        return adminEmails;
    }

    public List<DataSource> getSomeList() {
        return someList;
    }

    public Map<String, String> getSomeMap() {
        return someMap;
    }

    public Set<String> getSomeSet() {
        return someSet;
    }

    public void print() {
        LOGGER.info("StoreDao print");
        LOGGER.info("Properties:{}",JSON.toJSONString(adminEmails));
        LOGGER.info("list:{}",JSON.toJSONString(someList));
        LOGGER.info("map:{}", JSON.toJSONString(someMap));
        LOGGER.info("set:{}", JSON.toJSONString(someSet));
    }


}

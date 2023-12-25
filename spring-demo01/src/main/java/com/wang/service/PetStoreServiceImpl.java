package com.wang.service;

import com.wang.dao.JpaAccountDao;
import com.wang.dao.JpaItemDao;

/**
 * @ClassName PetStoreServiceImpl
 * @Description
 * @Author ww
 * @Time 2023/12/22 19:02
 */
public class PetStoreServiceImpl {

    JpaAccountDao accountDao;

    JpaItemDao itemDao;

    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public void save() {
        accountDao.save();
        itemDao.save();
    }
}

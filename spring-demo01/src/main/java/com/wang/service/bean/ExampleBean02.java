package com.wang.service.bean;

import com.wang.dao.AccountDao;
import com.wang.dao.ManageDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName ExampleBean02
 * @Description
 * @Author ww
 * @Time 2023/12/29 09:56
 */
public class ExampleBean02 {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleBean02.class);


    private ManageDao manageDao;

    private AccountDao accountDao;

    public ManageDao getManageDao() {
        return manageDao;
    }

    public void setManageDao(ManageDao manageDao) {
        this.manageDao = manageDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void exampleBean02() {
        LOGGER.info("ExampleBean02 invoke");
        manageDao.manageDao();
        // accountDao.accountDao();
    }
}

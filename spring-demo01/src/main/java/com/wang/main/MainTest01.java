package com.wang.main;

import com.wang.service.ClientService;
import com.wang.service.DefaultServiceLocator;
import com.wang.service.PetStoreServiceImpl;
import com.wang.service.bean.BeanOne;
import com.wang.service.bean.ExampleBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @ClassName MainTest01
 * @Description 测试spring容器获取bean,以xml配置方式注入bean
 * @Author ww
 * @Time 2023/12/25 20:41
 */
public class MainTest01 {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainTest01.class);

    public static void main(String[] args) {
        test07();
    }

    public static void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test01 start");
        context.getBean(PetStoreServiceImpl.class).save();
    }

    public static void test02() {
        // 运行时动态注册、修改、加载bean
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("services.xml");
        // 触发后置处理器执行
        context.refresh();
        context.getBean(PetStoreServiceImpl.class).save();
    }

    /**
     * bean的别名
     */
    public static void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test03 start");
        // context.getBean("petStoreService1", PetStoreServiceImpl.class).save();
        context.getBean("petStoreService2", PetStoreServiceImpl.class).save();
    }

    /**
     * 静态工厂实例化bean
     */
    public static void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test04 start");
        context.getBean(ClientService.class).invoke();
    }

    /**
     * 实例工厂实例化bean
     */
    public static void test05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test04 start");
        context.getBean(DefaultServiceLocator.class).defaultServiceLocatorInvoke();
    }

    /**
     * 基于构造器的依赖注入
     */
    public static void test06() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test06 start");
        context.getBean(BeanOne.class).beanOne();
    }

    /**
     * 构造参数已知情况下基于构造器的依赖注入
     */
    public static void test07() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test07 start");
        ExampleBean bean = context.getBean(ExampleBean.class);
        LOGGER.info("answers:{}",bean.getUltimateAnswer());
        LOGGER.info("years:{}", bean.getYears());
    }
}

package com.wang.main;

import com.wang.config.DataSource;
import com.wang.config.ParentDataSource;
import com.wang.dao.StoreDao;
import com.wang.service.*;
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

    /**
     * 基于set的依赖注入
     * <p>
     *     依赖解析过程：
     *     1.ApplicationContext是描述所有bean配置元数据和初始化
     *     2.对于每个bean，所依赖的bean以属性、构造函数参数、静态工厂方法参数表达的；创建bean时，这些依赖提供给bean
     *     3.每个属性和参数都得设计值的实际定义，或者容器中其他bean的引用
     *
     *     容器创建时，spring会验证每个bean的配置。在实际创建bean时bean的属性不会被设置；
     *     容器创建时，具有单例属性的bean会默认被创建，否则是在请求时才会创建；
     *     创建bean时，可能会创建bean图（bean的依赖关系）
     *
     *
     * </p>
     */
    public static void test08() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test08 start");
        context.getBean(SimpleMovieLister.class).simpleMovieLister();
    }

    /**
     * 测试循环依赖
     * <p>
     *     循环依赖：
     *     类A通过构造函数注入需要类B的一个实例，类B通过构造函数注入需要类A的一个实例。
     *     会抛BeanCurrentlyInCreationException异常
     *     解决：通过set注入
     * </p>
     */
    public static void test09() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test09 start");
        context.getBean(CyclicA.class).cyclicA();
        context.getBean(CyclicB.class).cyclicB();
    }

    /**
     * 字面值属性设置
     */
    public static void test10() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test10 start");
        DataSource bean = context.getBean(DataSource.class);
        LOGGER.info(bean.toString());
    }

    /**
     * <bean id="sonDataSource" class="com.wang.config.SonDataSource">
     *         <constructor-arg name="dataSource">
     *             <ref parent="myDataSource"/>
     *         </constructor-arg>
     *     </bean>
     * spring子容器引用父容器的bean
     * 例如springmvc bean属性引用spring容器bean，
     */

    /**
     * 内部bean
     */
    public static void test11() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test11 start");
        ParentDataSource bean = context.getBean(ParentDataSource.class);
        bean.parentDataSource();
    }

    public static void test12() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        LOGGER.info("test11 start");
        StoreDao bean = context.getBean(StoreDao.class);
        bean.print();
    }

    public static void main(String[] args) {
        test12();
    }

}

package com.baidu.langshiquan.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;

/**
 * Created by langshiquan on 17/9/29.
 */
public class FreeUnitTestBase {
    protected SessionFactory sessionFactory;

    @Before
    public void init() {
        // 创建配置对象
        Configuration config = new Configuration().configure();
        // 创建服务注册对象
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
                .buildServiceRegistry();
        // 创建会话工厂对象
        sessionFactory = config.buildSessionFactory(serviceRegistry);
    }

    @After
    public void destory() {
        sessionFactory.close();
    }

}

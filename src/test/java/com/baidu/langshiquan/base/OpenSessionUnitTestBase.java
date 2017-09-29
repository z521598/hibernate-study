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
public class OpenSessionUnitTestBase {
    protected SessionFactory sessionFactory;
    protected Session session;
    protected Transaction transaction;

    @Before
    public void init() {
        // 创建配置对象
        Configuration config = new Configuration().configure();
        // 创建服务注册对象
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
                .buildServiceRegistry();
        // 创建会话工厂对象
        sessionFactory = config.buildSessionFactory(serviceRegistry);
        // 会话对象
        session = sessionFactory.openSession();
        // 开启事务
        transaction = session.beginTransaction();
    }

    @After
    public void destory() {
        if (transaction != null) {
            // 提交事务
            transaction.commit();
        }
        if (session != null) {
            session.close();
        }
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

}

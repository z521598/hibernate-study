package com.baidu.langshiquan.cache;


import org.hibernate.Session;
import org.junit.Test;

import com.baidu.langshiquan.base.FreeUnitTestBase;
import com.baidu.langshiquan.module.Order;
import com.baidu.langshiquan.module.User;

/**
 * Created by langshiquan on 17/9/30.
 */
public class SecondLevelCacheTest extends FreeUnitTestBase {

    @Test
    public void testXmlCache() {
        Session session1 = sessionFactory.openSession();
        Order order1 = (Order) session1.get(Order.class,1l);
        Session session2 = sessionFactory.openSession();
        Order order2 = (Order) session2.get(Order.class,1l);
    }

    @Test
    public void testAnnoCache() {
        Session session1 = sessionFactory.openSession();
        User user1 = (User) session1.get(User.class,1);
        Session session2 = sessionFactory.openSession();
        User user2 = (User) session2.get(User.class,1);
    }



}

package com.baidu.langshiquan.cache;

import org.hibernate.Session;
import org.hibernate.Transaction;
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
        Order order1 = (Order) session1.get(Order.class, 1l);
        Session session2 = sessionFactory.openSession();
        Order order2 = (Order) session2.get(Order.class, 1l);
    }

    @Test
    public void testAnnoCache() {
        Session session1 = sessionFactory.openSession();
        User user1 = (User) session1.get(User.class, 1);
        Session session2 = sessionFactory.openSession();
        User user2 = (User) session2.get(User.class, 1);
    }

    @Test
    public void testCacheStrategy_READ_ONLY() {
        Session session1 = sessionFactory.openSession();
        //        Transaction transaction = session1.beginTransaction();
        Order order1 = (Order) session1.get(Order.class, 1l);
        System.out.println("order1:" + order1);
        // 修改order，会报错！！！
        order1.setWeight(90);
        session1.update(order1);
        //        transaction.commit();
        // 同一session查询
        //        Order order2 = (Order) session1.get(Order.class, 1l);
        //        System.out.println("order2:" + order2);
        // 其他session查询
        Session session3 = sessionFactory.openSession();
        Order order3 = (Order) session3.get(Order.class, 1l);
        System.out.println("order3:" + order3);
    }

    @Test
    public void testCacheStrategy_READ_WRITE() {
        Session session1 = sessionFactory.openSession();
        Transaction transaction = session1.beginTransaction();
        User user1 = (User) session1.get(User.class, 1);
        System.out.println("user1:" + user1);
        // 修改user
        user1.setAddress("shanghai");
        session1.update(user1);
        transaction.commit();
        // 同一session查询
        User user2 = (User) session1.get(User.class, 1);
        System.out.println("user2:" + user2);
        // 其他session查询
        Session session3 = sessionFactory.openSession();
        User user3 = (User) session3.get(User.class, 1);
        System.out.println("user3:" + user3);
    }

}

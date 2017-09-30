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
public class SecondLevelUpdateCacheTest extends FreeUnitTestBase {

    @Test
    public void testCacheStrategy_READ_WRITE() {
        Session session1 = sessionFactory.openSession();
        Transaction transaction = session1.beginTransaction();
        User user1 = (User) session1.get(User.class, 1);
        System.out.println("user1:" + user1);
        // 修改user
        user1.setAddress("bj");
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

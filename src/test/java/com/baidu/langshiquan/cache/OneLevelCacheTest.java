package com.baidu.langshiquan.cache;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.junit.Test;

import com.baidu.langshiquan.base.CurrentSessionUnitTestBase;
import com.baidu.langshiquan.model.User;

/**
 * Created by langshiquan on 17/9/30.
 */
public class OneLevelCacheTest extends CurrentSessionUnitTestBase {

    // Query list()不会使用一级缓存
    @Test
    public void testQueryList() {
        Query query = session.createQuery("from User");
        List<User> userList = query.list();
        System.out.println(userList);
        List<User> userList1 = query.list();
        System.out.println(userList1);
    }

    // Query iterate()会使用一级缓存
    @Test
    public void testQueryIter() {
        Query query = session.createQuery("from User");
        Iterator<User> iterator = query.iterate();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getAddress());
        }
        System.out.println("==============================");
        Iterator<User> iterator2 = query.iterate();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next().getSname());
        }
        Iterator<User> iterator3 = query.iterate();
        System.out.println("==============================");
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next().getSname());
        }
        System.out.println();
    }
}

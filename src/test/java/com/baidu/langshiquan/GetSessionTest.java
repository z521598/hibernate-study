package com.baidu.langshiquan;

import org.hibernate.Session;
import org.junit.Test;

import com.baidu.langshiquan.base.FreeUnitTestBase;

/**
 * Created by langshiquan on 17/9/29.
 */
public class GetSessionTest extends FreeUnitTestBase {

    @Test
    public void testCurrentSession() {
        Session session1 = sessionFactory.getCurrentSession();
        Session session2 = sessionFactory.getCurrentSession();
        System.out.println(session1 == session2);
    }

    @Test
    public void testOpenSession() {
        Session session1 = sessionFactory.openSession();
        Session session2 = sessionFactory.openSession();
        System.out.println(session1 == session2);
    }


}

package com.baidu.langshiquan;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.junit.Test;

import com.baidu.langshiquan.base.FreeUnitTestBase;
import com.baidu.langshiquan.module.User;

/**
 * Created by langshiquan on 17/9/29.
 */
public class SessionWorkTest extends FreeUnitTestBase {

    @Test
    public void testSession(){
        Session session = sessionFactory.openSession();
        session.doWork(new Work() {
            public void execute(Connection connection) throws SQLException {
                connection.setAutoCommit(true);
            }
        });
        User user = new User("zdh", "woman", new Date(), "beijing");
        session.save(user);
        session.flush();
    }

    @Test
    public void testSessionWithoutTrans() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = new User("zdh", "woman", new Date(), "beijing");
        session.save(user);
        transaction.commit();
    }


}

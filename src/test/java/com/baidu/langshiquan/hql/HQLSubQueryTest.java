package com.baidu.langshiquan.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.base.HQLUnitTestBase;

/**
 * Created by langshiquan on 17/10/21.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HQLSubQueryTest extends HQLUnitTestBase {
    @Test
    public void testNoSubQuery() {
        String oneHql = "select o.id from Orderform o where id = 3";
        Query query = session.createQuery(oneHql);

        List<Integer> ids = query.list();
        int id = ids.get(0);


    }

    @Test
    public void testSubQuery2() {
        String twoHql = "select oi from Orderitem oi,Orderform ofo where ofo.id = oi.orderid";
        Query query2 = session.createQuery(twoHql);
        System.out.println(query2.list());
    }

    @Test
    public void testSQLQuery() {
        SQLQuery sqlQuery = session.createSQLQuery("select oi.* from Orderitem oi,Orderform ofo where ofo.id = oi"
                + ".orderid");
        System.out.println(sqlQuery.list());
    }
}


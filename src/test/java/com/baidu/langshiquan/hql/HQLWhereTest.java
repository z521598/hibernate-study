package com.baidu.langshiquan.hql;

import java.util.List;

import org.hibernate.Query;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.base.HQLUnitTestBase;
import com.baidu.langshiquan.hql.model.Commodity;
import com.baidu.langshiquan.hql.model.Customer;

/**
 * Created by langshiquan on 17/10/15.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HQLWhereTest extends HQLUnitTestBase {

    @Test
    public void testWhere() {
        String distinctHql = "from Commodity c where c.price > 400";
        Query query = session.createQuery(distinctHql);
        List<Commodity> list = query.list();
        System.out.println(list);
    }

    @Test
    public void testNull() {
        String distinctHql = "from Commodity c where c.description != null";
        Query query = session.createQuery(distinctHql);
        List<Commodity> list = query.list();
        System.out.println(list);
    }

    @Test
    public void testIn() {
        String distinctHql = "from Customer c where c.age in (20,40)";
        Query query = session.createQuery(distinctHql);
        List<Commodity> list = query.list();
        System.out.println(list);
    }

    @Test
    public void testBetween() {
        String distinctHql = "from Customer c where c.age between 20 and 40";
        Query query = session.createQuery(distinctHql);
        List<Commodity> list = query.list();
        System.out.println(list);
    }

    @Test
    public void testLike() {
        String likeHql = "from Customer c where c.name like '张_'";
        Query query = session.createQuery(likeHql);
        System.out.println(query.list());
    }

    @Test
    public void testOneObj() {
        String likeHql = "from Customer c where c.name = '张三'";
        Query query = session.createQuery(likeHql);
        Customer customer = (Customer) query.uniqueResult();
        System.out.println(customer);
    }
}
package com.baidu.langshiquan.hql;

import java.util.List;

import org.hibernate.Query;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.base.HQLUnitTestBase;

/**
 * Created by langshiquan on 17/10/15.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HQLTest extends HQLUnitTestBase {

    @Test
    public void testDistinct() {
        String distinctHql = "select distinct c.sex from Customer c";
        Query query = session.createQuery(distinctHql);
        List<Object> list = query.list();
        System.out.println(list);

    }
}
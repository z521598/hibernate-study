package com.baidu.langshiquan.hql;

import org.hibernate.Query;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.base.HQLUnitTestBase;

/**
 * Created by langshiquan on 17/10/15.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HQLSimpleTest extends HQLUnitTestBase{

    @Test
    public void testHQL() {
        String simpleHql = "from Seller";
        Query query = session.createQuery(simpleHql);
        System.out.println(query.list());
    }
}

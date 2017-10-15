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
public class HQLOrderByTest extends HQLUnitTestBase {

    @Test
    public void testDesc() {
        // 查询多个属性，未指定返回类型，默认返回List<Obejct[]>
        // 查询一个属性，未指定返回类型，默认返回List<Obejct>
        String selectHql = "from Seller s order by s.id desc,s.star asc ";
        Query query = session.createQuery(selectHql);
        System.out.println(query.list());
    }
}

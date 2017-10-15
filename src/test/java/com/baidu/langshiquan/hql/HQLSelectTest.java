package com.baidu.langshiquan.hql;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.base.HQLUnitTestBase;
import com.baidu.langshiquan.hql.model.Seller;

/**
 * Created by langshiquan on 17/10/15.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HQLSelectTest extends HQLUnitTestBase {

    @Test
    public void testHQL() {
        // 不需要使用全限定名字
        String simpleHql = "from Seller as c";
        Query query = session.createQuery(simpleHql);
        System.out.println(query.list());
    }

    @Test
    public void testSelect() {
        // 查询多个属性，未指定返回类型，默认返回List<Obejct[]>
        // 查询一个属性，未指定返回类型，默认返回List<Obejct>
        String selectHql = "select s.address,s.name from Seller s";
        Query query = session.createQuery(selectHql);
        List<Object[]> list = query.list();
        for (Object[] objects : list) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }
    }

    @Test
    public void testSelectReturnList() {
        String selectHql = "select new list(s.address,s.name) from Seller s";
        Query query = session.createQuery(selectHql);
        List<List> lists = query.list();
        for (List list : lists) {
            System.out.println(list);
        }
    }

    @Test
    public void testSelectReturnMap() {
        String selectHql = "select new map(s.address,s.name) from Seller s";
        Query query = session.createQuery(selectHql);
        List<Map<String, String>> maps = query.list();
        System.out.println("by index");
        for (Map<String, String> map : maps) {
            System.out.println(map.get("0"));
            System.out.println(map.get("1"));
        }
    }

    @Test
    public void testSelctReturnMapGetByAlias() {
        String selectHql2 = "select new map(s.address as address,s.name as name) from Seller s";
        Query query2 = session.createQuery(selectHql2);
        List<Map<String, String>> maps2 = query2.list();
        System.out.println("by alias");
        for (Map<String, String> map : maps2) {
            System.out.println(map.get("address"));
            System.out.println(map.get("name"));
        }
    }

    @Test
    public void testSelectReturnUserDefined() {
        String selectHql = "select new Seller(s.address,s.name,s.tel) from Seller s";
        Query query2 = session.createQuery(selectHql);
        List<Seller> lsit = query2.list();
        for (Seller seller : lsit) {
            System.out.println(seller);
        }

    }
}

package com.baidu.langshiquan;

import org.junit.Test;

import com.baidu.langshiquan.base.CurrentSessionUnitTestBase;
import com.baidu.langshiquan.model.Order;

/**
 * Created by langshiquan on 17/9/29.
 */
public class HbmTest extends CurrentSessionUnitTestBase {

    @Test
    public void testHbmGene() {
        Order order = new Order(1l,20);
        session.save(order);
    }

    @Test
    public void testPrimaryKeyGeneStra() {
        Order order = new Order(20);
        session.save(order);
    }
}

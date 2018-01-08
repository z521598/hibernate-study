package com.baidu.langshiquan.session;

import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.base.FreeUnitTestBase;

/**
 * Created by langshiquan on 17/12/29.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class Session2Test extends FreeUnitTestBase{

    @Test
    public void testSession() {
        Session session = sessionFactory.openSession();


    }
}

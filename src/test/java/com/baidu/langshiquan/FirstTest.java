package com.baidu.langshiquan;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.module.User;

/**
 * Created by langshiquan on 17/9/29.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class FirstTest extends UnitTestBase {

    @Test
    public void testFirst() {
        User user = new User(1, "lsq", "man", new Date(), "beijing");
        session.save(user);
    }
}

package com.baidu.langshiquan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.base.CurrentSessionUnitTestBase;
import com.baidu.langshiquan.module.User;

/**
 * Created by langshiquan on 17/9/29.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class CURDTest extends CurrentSessionUnitTestBase {

    @Test
    public void testGet() {
        User user = (User) session.get(User.class, 1);
        System.out.println(user);
    }

    @Test
    public void testLoad() {
        User user = (User) session.load(User.class, 1);
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
        User user = (User) session.get(User.class, 1);
        System.out.println(user);
        user.setSname("cc");
        session.update(user);
        User resUser = (User) session.get(User.class, 1);
        System.out.println(resUser);
    }

    @Test
    public void testDelete() {
        session.delete(1);
    }
}

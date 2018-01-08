package com.baidu.langshiquan.session;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.baidu.langshiquan.base.CurrentSessionUnitTestBase;
import com.baidu.langshiquan.model.User;

/**
 * Created by langshiquan on 17/12/29.
 */
@RunWith(MockitoJUnitRunner.class)
public class SessionTest extends CurrentSessionUnitTestBase {

    // catch了org.hibernate.exception.DataException的导致的问题:
    // 1）在一个session里，再次save导致失败,异常信息
    // 2）同时导致之前的事务回滚。
    // null id in com.baidu.langshiquan.model.User entry (don't flush the Session after an exception occurs)
    @Test
    public void testException() {
        User user3 = new User();
        user3.setSname("zdh");
        user3.setGender("girl");
        user3.setBirthday(new Date());
        session.save(user3);

        User user = new User();
        user.setSname("lsq");
        String address = "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
                + "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
                + "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
                + "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
                + "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
                + "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
                + "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十";
        user.setAddress(address);
        System.out.println(session.isDirty());
        try {
            session.save(user);
        }catch (Exception e){
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            public void run() {
                User user2 = new User();
                user2.setSname("zdh3");
                user2.setGender("girl3");
                user2.setBirthday(new Date());
                session.save(user2);
            }
        });

    }

}

package com.test;

import com.gztech.bos.dao.IUserDao;
import com.gztech.bos.model.User;
import com.gztech.bos.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class Demo02 {

    @Autowired
    private IUserService userService;

    //测试Dao
    @Test
    public void test1() {
        //1.创建User
        User user = new User();
        user.setUsername("gztech");
        user.setPassword("123");

        //2.保存
        userService.save(user);
    }
}

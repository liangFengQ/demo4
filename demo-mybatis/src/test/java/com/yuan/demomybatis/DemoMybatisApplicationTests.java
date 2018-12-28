package com.yuan.demomybatis;

import com.yuan.demomybatis.mapper.UserMapper;
import com.yuan.demomybatis.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
        System.out.println(userMapper.insert(new User()));
        System.out.println(userMapper.selectAll());
    }
}


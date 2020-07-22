package com.company.mybatis.service;

import com.alibaba.fastjson.JSON;
import com.company.mybatis.dao.entity.User;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {
    @Autowired
    IUserService userService;

    @Test
    public void findAll() {
        PageInfo pageInfo = userService.findAll(2,2);
        System.err.println(pageInfo);
        pageInfo.getList().stream().forEach(System.err::println);
        System.err.println(JSON.toJSONString(pageInfo));
    }
}
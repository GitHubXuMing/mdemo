package com.company.mybatis.dao;

import com.company.mybatis.dao.entity.QueryVO;
import com.company.mybatis.dao.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DySelectDaoTest {
    @Autowired
    DySelectDao dySelectDao;

    @Test
    public void dynamicSelect() {
        QueryVO vo = new QueryVO();
        vo.setId(2);
//        vo.setUsername("a");
        vo.setMinSal(new BigDecimal("7900"));
        vo.setMaxSal(new BigDecimal("8800"));
        List<User> users = dySelectDao.dynamicSelect(vo);
        users.stream().forEach(System.err::println);
    }
}
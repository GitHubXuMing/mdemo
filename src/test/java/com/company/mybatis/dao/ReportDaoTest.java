package com.company.mybatis.dao;

import com.company.mybatis.dao.entity.EmpDeptDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ReportDaoTest {
    @Autowired
    ReportDao reportDao;

    @Test
    public void getInfo1() {
        List<EmpDeptDTO> edds = reportDao.getInfo1();
        edds.stream().forEach(System.err::println);
    }
}
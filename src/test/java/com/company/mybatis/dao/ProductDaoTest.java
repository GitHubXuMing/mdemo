package com.company.mybatis.dao;

import com.company.mybatis.dao.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Slf4j
public class ProductDaoTest {
    @Autowired
    ProductDao productDao;
    @Test
    public void deleteByPrimaryKey() {
        log.info("delete");
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {

    }

    @Test
    public void selectByPrimaryKey() {
        System.err.println(productDao.selectByPrimaryKey(5));
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}
package com.company.mybatis.service;

import com.company.mybatis.dao.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ProductServiceTest {
    @Autowired
    IProductService productService;
    @Test
    public void insertBatch() {
        List<Product> products = Arrays.asList(
                new Product("zhao",new BigDecimal("11")),
                new Product("qian",new BigDecimal("22")),
                new Product("sun",new BigDecimal("33")),
                new Product("li",new BigDecimal("44")),
                new Product("zhou",new BigDecimal("55")),
                new Product("wu",new BigDecimal("66"))
        );
        productService.insertBatch(products);
    }

    @Test
    public void insertBatchMapper() {
        List<Product> products = Arrays.asList(
                new Product("zhao",new BigDecimal("11")),
                new Product("qian",new BigDecimal("22")),
                new Product("sun",new BigDecimal("33")),
                new Product("li",new BigDecimal("44")),
                new Product("zhou",new BigDecimal("55")),
                new Product("wu",new BigDecimal("66"))
        );
        productService.insertBatchMapper(products);
    }
    @Test
    public void deleteBatch(){
        List<Integer> ids = Arrays.asList(18,19,20,23);
        int result = productService.deleteBatch(ids);
        System.err.println(result);
    }
}
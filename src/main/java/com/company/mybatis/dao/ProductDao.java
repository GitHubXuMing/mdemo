package com.company.mybatis.dao;

import com.company.mybatis.dao.entity.Product;

import java.util.List;

public interface ProductDao {
    int deleteByPrimaryKey(Integer pid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int insertBatch(List<Product> productList);

    int deleteBatch(List<Integer> ids);

}
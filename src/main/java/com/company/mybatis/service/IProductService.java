package com.company.mybatis.service;

import com.company.mybatis.dao.entity.Product;

import java.util.List;

public interface IProductService {
    public int insertBatch(List<Product> productList);
    public int insertBatchMapper(List<Product> productList);
    public int deleteBatch(List<Integer> ids);
}

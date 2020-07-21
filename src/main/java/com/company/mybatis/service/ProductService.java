package com.company.mybatis.service;

import com.company.mybatis.dao.ProductDao;
import com.company.mybatis.dao.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    ProductDao productDao;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRES_NEW)
    public int insertBatch(List<Product> productList) {
        int result = 0;
        if(productList != null && productList.size()>0) {
            for (Product product : productList) {
                productDao.insert(product);
                result++;
            }
        }
        return result;
    }
}

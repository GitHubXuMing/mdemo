package com.company.mybatis.dao.entity;

import lombok.*;
import org.apache.ibatis.annotations.ConstructorArgs;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Product {
    private Integer pid;

    private String pname;

    private BigDecimal price;

    private Date pdate;

    public Product(String pname, BigDecimal price) {
        this.pname = pname;
        this.price = price;
    }

    public Product(String pname, BigDecimal price, Date pdate) {
        this.pname = pname;
        this.price = price;
        this.pdate = pdate;
    }

    public Product(Integer pid, String pname, BigDecimal price, Date pdate) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.pdate = pdate;
    }
}
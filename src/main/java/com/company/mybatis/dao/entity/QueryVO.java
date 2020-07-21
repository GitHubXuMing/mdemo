package com.company.mybatis.dao.entity;

import java.math.BigDecimal;

public class QueryVO {
    private Integer id;
    private String username;
    private BigDecimal minSal;
    private BigDecimal maxSal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getMinSal() {
        return minSal;
    }

    public void setMinSal(BigDecimal minSal) {
        this.minSal = minSal;
    }

    public BigDecimal getMaxSal() {
        return maxSal;
    }

    public void setMaxSal(BigDecimal maxSal) {
        this.maxSal = maxSal;
    }

    public QueryVO() {
    }

    public QueryVO(Integer id, String username, BigDecimal minSal, BigDecimal maxSal) {
        this.id = id;
        this.username = username;
        this.minSal = minSal;
        this.maxSal = maxSal;
    }
}

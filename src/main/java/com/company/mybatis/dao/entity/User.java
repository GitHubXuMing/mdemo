package com.company.mybatis.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private Date birth;
    private BigDecimal sal;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birth=" + birth +
                ", sal=" + sal +
                '}';
    }

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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public User(String username, Date birth, BigDecimal sal) {
        this.username = username;
        this.birth = birth;
        this.sal = sal;
    }

    public User(Integer id, String username, Date birth, BigDecimal sal) {
        this.id = id;
        this.username = username;
        this.birth = birth;
        this.sal = sal;
    }

    public User() {
    }
}

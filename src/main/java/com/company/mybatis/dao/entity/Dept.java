package com.company.mybatis.dao.entity;

import java.util.List;

public class Dept {
    private Integer did;
    private String dname;
    private List<Student> stus;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    public Dept() {
    }

    public Dept(Integer did, String dname, List<Student> stus) {
        this.did = did;
        this.dname = dname;
        this.stus = stus;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", stus=" + stus.size() +
                '}';
    }
}

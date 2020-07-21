package com.company.mybatis.dao.entity;

public class Course {
    private Integer cid;
    private String cname;

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Course(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Course() {
    }
}

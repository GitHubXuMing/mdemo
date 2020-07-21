package com.company.mybatis.dao.entity;

import java.util.List;

public class Student {
    private Integer sid;
    private String sname;
    private Integer did;
    List<Score> scores;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", did=" + did +
                ", scores=" + scores.stream() +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public Student(Integer sid, String sname, Integer did, List<Score> scores) {
        this.sid = sid;
        this.sname = sname;
        this.did = did;
        this.scores = scores;
    }
}

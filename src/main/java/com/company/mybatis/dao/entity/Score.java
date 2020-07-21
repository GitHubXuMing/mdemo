package com.company.mybatis.dao.entity;

import java.math.BigDecimal;

public class Score {
    private Integer scid;
    private Integer sid;
    private Integer cid;
    private BigDecimal score;
    private Course course;

    @Override
    public String toString() {
        return "Score{" +
                "scid=" + scid +
                ", sid=" + sid +
                ", cid=" + cid +
                ", score=" + score +
                ", course=" + course +
                '}';
    }

    public Score(Integer scid, Integer sid, Integer cid, BigDecimal score, Course course) {
        this.scid = scid;
        this.sid = sid;
        this.cid = cid;
        this.score = score;
        this.course = course;
    }

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Score() {
    }
}

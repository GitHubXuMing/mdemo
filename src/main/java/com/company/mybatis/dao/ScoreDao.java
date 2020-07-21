package com.company.mybatis.dao;

import com.company.mybatis.dao.entity.Dept;
import com.company.mybatis.dao.entity.Student;

public interface ScoreDao {
    public Student getStuInfo(Integer sid);
}

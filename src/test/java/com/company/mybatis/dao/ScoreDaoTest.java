package com.company.mybatis.dao;

import com.company.mybatis.dao.entity.Dept;
import com.company.mybatis.dao.entity.Score;
import com.company.mybatis.dao.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ScoreDaoTest {
    @Autowired
    ScoreDao scoreDao;

    @Test
    public void getStuInfo() {
        Student stu = scoreDao.getStuInfo(1);
        System.err.println(stu.getSname()+"的课程成绩是");
        List<Score> scoreList = stu.getScores();
        for(Score score:scoreList){
            System.err.println(score.getCourse().getCname()+"成绩: "+score.getScore());
        }
        System.err.println("***********************************************");
        Student stu2 = scoreDao.getStuInfo(1);
        System.err.println(stu2.getSname()+"的课程成绩是");
        List<Score> scoreList2 = stu2.getScores();
        for(Score score:scoreList2){
            System.err.println(score.getCourse().getCname()+"成绩: "+score.getScore());
        }
    }
}
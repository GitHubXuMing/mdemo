package com.company.mybatis.dao;

import com.company.mybatis.dao.entity.PageVO;
import com.company.mybatis.dao.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void findById() {
        System.err.println(userDao.findById(3));
        System.err.println("****************************************************");
        System.err.println(userDao.findById(3));
    }
    @Test
    public void findByPage() {
        System.err.println(userDao.findByPage(0,3));
        System.err.println(userDao.findByPage(2,2));
    }
    @Test
    public void findByName() {
        System.err.println(userDao.findByName1("ao"));
        System.err.println(userDao.findByName2("n"));
    }
    @Test
    public void save() {
        User user = new User("zhou",new Date(),new BigDecimal("2.3"));
        int result = userDao.save(user);
        System.err.println("save result:"+result);
        userDao.findByPage(0,10).stream().forEach(System.err::println);
    }
    @Test
    public void delete() {
        User user = new User();
        user.setId(6);
        userDao.delete(user);
        userDao.findByPage(0,10).stream().forEach(System.err::println);
    }
    @Test
    public void update() {
       User user = new User();
       user.setId(1);
       user.setSal(new BigDecimal("8888"));
       user.setUsername("AAAA");
       userDao.update(user);
       userDao.findByPage(0,10).stream().forEach(System.err::println);
    }

    @Test
    public void findBySal() {
        userDao.findByMaxSal(new BigDecimal("8800")).forEach(System.err::println);
    }

    @Test
    public void findByPageVO() {
        PageVO pv = new PageVO();
        pv.setStart(2);
        pv.setSize(2);
        userDao.findByPageVO(pv).stream().forEach(System.err::println);
    }
    @Test
    public void raiseSal(){
        List<Integer> ids = Arrays.asList(1,2,4);
        int result = userDao.raiseSal(ids);
        System.err.println("*********************:"+result);
    }

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    private static Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
    @Test
    public void testSessionCache()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //生成代理类
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        User user1=userDao.findById(1);
        logger.debug("******************"+user1);
        //再次执行查找用户，发现不会输出sql语句了
        User user2=userDao.findById(1);
        logger.debug("$$$$$$$$$$$$$$$$$$$"+user2);
        sqlSession.close();
    }
}

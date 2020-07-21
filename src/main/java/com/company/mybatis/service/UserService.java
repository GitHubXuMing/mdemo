package com.company.mybatis.service;

import com.company.mybatis.dao.UserDao;
import com.company.mybatis.dao.entity.PageVO;
import com.company.mybatis.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    UserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findByPage(Integer start, Integer size) {
        return null;
    }

    @Override
    public List<User> findByPageVO(PageVO pv) {
        return null;
    }

    @Override
    public List<User> findByName1(String username) {
        return null;
    }

    @Override
    public List<User> findByName2(String username) {
        return null;
    }

    @Override
    public int save(User user) {
        return 0;
    }

    @Override
    public int delete(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public List<User> findByMaxSal(BigDecimal maxSal) {
        return null;
    }

    @Override
    public int raiseSal(List<Integer> ids) {
        return 0;
    }
}

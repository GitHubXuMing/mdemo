package com.company.mybatis.service;

import com.company.mybatis.dao.entity.PageVO;
import com.company.mybatis.dao.entity.User;

import java.math.BigDecimal;
import java.util.List;

public interface IUserService {
    public User findById(Integer id);
    public List<User> findByPage(Integer start, Integer size);
    public List<User> findByPageVO(PageVO pv);
    public List<User> findByName1( String username);
    public List<User> findByName2(String username);
    public int save(User user);
    public int delete(User user);
    public int update(User user);

    public List<User> findByMaxSal(BigDecimal maxSal);

    public int raiseSal(List<Integer> ids);
}
